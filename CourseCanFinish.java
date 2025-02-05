package study.GraphGeneral;

import java.util.*;

public class CourseCanFinish {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}, {0,1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0)
            return false;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            List<Integer> currList = map.getOrDefault(prerequisite[0], new ArrayList<>());
            currList.add(prerequisite[1]);
            map.put(prerequisite[0], currList);
        }

        Queue<Integer> q = new LinkedList<>();

        Set<Integer> isVisited = new HashSet<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {

            if (!isVisited.contains(entry.getKey())) {
                q.offer(entry.getKey());
                isVisited.add(entry.getKey());

                Set<Integer> pre = new HashSet<>();
                while (!q.isEmpty()) {

                    int val = q.poll();
                    if (pre.contains(val))
                        return false;
                    else {
                        pre.add(val);
                        isVisited.add(val);
                        List<Integer> li = map.getOrDefault(val, new ArrayList<>()) ;
                        for (int j = 0; j < li.size(); j++) {
//                            if(!isVisited.contains(li.get(j)))
                            q.offer(li.get(j));
                        }
                    }
                }
            }
        }
        return true;
    }
}
