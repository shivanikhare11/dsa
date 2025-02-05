package study.GraphGeneral;

import study.array.MaxValueOfEquation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourceLeadToDestination {

    public static void main(String[] args) {
       int n = 4; int[][] edges = {{0,1},{0,2},{1,3},{2,3}}; int source = 0; int  destination = 3;

        System.out.println(leadsToDestination(n, edges, source, destination));

    }
    public static boolean leadsToDestination(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();


        for(int i =0; i < edges.length; i++){
            List<Integer> list = graph.getOrDefault(edges[i][0], new ArrayList<>());
            list.add(edges[i][1]);
            graph.put(edges[i][0], list);
        }
        boolean[] isVisited =  new boolean[n];

        boolean reachDestination = reachDestination(graph, source, destination, isVisited );

        if(!reachDestination) return false;

//        for(boolean vis : isVisited){
//            if(!vis) return false;
//        }
        return true;
    }

    public static boolean reachDestination( Map<Integer, List<Integer>> graph, int source, int dest,  boolean[] isVisited ){

        if(source == dest && !graph.containsKey(source)) return true;
        if(source != dest && !graph.containsKey(source)){
            return false;
        }
        if(isVisited[source]) return false;

        isVisited[source] = true;

        for(Integer i : graph.get(source)){
            if(!isVisited[i]){
                isVisited[source] = true;
                if(!reachDestination(graph, i, dest,isVisited )) return false;
            }
        }

        return true;
    }

}
