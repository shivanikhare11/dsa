package study.GraphGeneral;

import java.util.*;

public class CourseScheduleII {

    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {{0,1}};

        findOrder(numCourses, prerequisites);


    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] out = new int[numCourses];
        // if (prerequisites.length == 0) {
        //     for (int i = 0; i < numCourses; i++) {

        //         out[i] = i;

        //     }
        //     return out;
        // }

        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> isVisited = new HashSet<>();

        for (int[] prerequisite : prerequisites) {
            List<Integer> list = map.getOrDefault(prerequisite[0], new ArrayList<>());
            list.add(prerequisite[1]);
            map.put(prerequisite[0], list);
        }

        for (int i = 0; i < numCourses; i++) {

            if (isVisited.contains(i))
                continue;

            if (!helper(i, map, new HashSet<>(), isVisited))
                return new int[0];
        }

        // int[] out = new int[isVisited.size()];
        int index = 0;
        for (Integer num : isVisited) {
            out[index++] = num;
        }
        return out;

    }

    public static boolean helper(int course, Map<Integer, List<Integer>> map, Set<Integer> isVisiting,
                                 Set<Integer> isVisited) {

        if (isVisiting.contains(course))
            return false;

        List<Integer> list = map.getOrDefault(course, new ArrayList<Integer>());
        if (list.isEmpty()) {
            if (!isVisited.contains(course)) {
                System.out.println(course);
                isVisited.add(course);
            }
            return true;
        }

        isVisiting.add(course);

        for (int i = 0; i < list.size(); i++) {
            if (!helper(list.get(i), map, isVisiting, isVisited))
                return false;
        }

        isVisiting.remove(course);
        System.out.println(course);
        isVisited.add(course);

        map.put(course, new ArrayList<>());
        return true;
    }
}
