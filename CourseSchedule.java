package study.GraphGeneral;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CourseSchedule {

    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        System.out.println(canFinish(numCourses, prerequisites));
    }
    public static  boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer,Integer> graph =  makeGraph(prerequisites);

        int course = prerequisites[0][0];
        int preCourse = prerequisites[0][1];

        return prerequisite(course, preCourse, numCourses, graph,  new HashSet<>());


    }

    public static boolean prerequisite(int c, int p, int numCourses,
                                       Map<Integer,Integer> graph, HashSet<Integer> isVisted){

        if(isVisted.contains(c) ) return false;

        if(isVisted.size() == numCourses) return true;

        isVisted.add(c);


        boolean out =  prerequisite(graph.get(c), graph.get(graph.get(c)),numCourses, graph, isVisted);
        return out;
    }



    public static Map<Integer,Integer>  makeGraph(int[][] prerequisites){

        Map<Integer,Integer> graph = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++){
            graph.putIfAbsent(prerequisites[i][0], prerequisites[i][1]);
            graph.putIfAbsent(prerequisites[i][1], prerequisites[i][0]);
        }
        return graph;
    }
}
