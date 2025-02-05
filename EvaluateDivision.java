package study.GraphGeneral;

import java.util.*;

public class EvaluateDivision {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

            Map<String , Map<String, Double>> graph = makeGraph(equations, values);
            double[] ans = new double[queries.size()];

            for(int i =0 ; i < queries.size(); i++){
                String src = queries.get(i).get(0);
                String dest = queries.get(i).get(1);
                ans[i] = dfs(src,dest, new HashSet<>(), graph);
            }
            return ans;
        }

        public static double dfs(String src, String dest, Set<String> visited, Map<String , Map<String, Double>> graph){

            if(!graph.containsKey(src)) return  -1.0;

            if(graph.get(src).containsKey(dest)) return graph.get(src).get(dest);

            visited.add(src);

            for(Map.Entry<String, Double> map : graph.get(src).entrySet()){

                if(visited.contains(map.getKey()) ==false){

                    double weight = dfs(map.getKey(), dest,visited, graph);

                    if(weight != -1.0){

                        return map.getValue() * weight;
                    }
                }
            }

            return -0.1;
        }

        public static Map<String , Map<String, Double>> makeGraph(List<List<String>> equations, double[] values){

            Map<String , Map<String, Double>> graph = new HashMap();
            String u,v;

            for(int i =0 ;i < equations.size();i++){

                u = equations.get(i).get(0);
                v = equations.get(i).get(1);

                graph.putIfAbsent(u, new HashMap<>());
                graph.get(u).put(v, values[i]);
                graph.putIfAbsent(v, new HashMap<>());
                graph.get(v).put(u, 1/values[i]);

            }
            return graph;
        }
}

