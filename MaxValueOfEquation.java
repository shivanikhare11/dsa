package study.array;

import java.util.PriorityQueue;

public class MaxValueOfEquation {
    public static void main(String[] args) {

//        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};

        int[][] points = {{-19,-12},{-13,-18},{-12,18},{-11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}};
        int k = 6;
//        int max = Integer.MIN_VALUE;

        PriorityQueue<int[]> p = new PriorityQueue<int[]>((a,b) ->( b[1] -b[0] - a[1]-a[0]));

        int ans = Integer.MIN_VALUE;

        for (int[] point : points) {

            while (!p.isEmpty() && point[0] - p.peek()[1] > k) {
                p.remove();
            }

            if (!p.isEmpty()) {
                ans = Math.max(ans, point[0] + point[1] + p.peek()[0]);
            }

            p.offer(new int[]{point[1] - point[0], point[0]});
        }

        System.out.println(ans);

//        PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
//
//        for(int[] point : points) {
//            while(!maxHeap.isEmpty() && point[0] - maxHeap.peek().getValue() > k) {
//                maxHeap.poll();
//            }
//            if(!maxHeap.isEmpty()) {
//                max = Math.max(max, point[0] + point[1] + maxHeap.peek().getKey());
//            }
//            maxHeap.offer(new Pair<Integer, Integer>(point[1] - point[0], point[0]));
//        }
//        System.out.println(max);

    }

    public static class Pair<T, T1> {

        T key;
        T1 value;

        public T getKey(){
            return this.key;
        }

        public T1 getValue(){
            return this.value;
        }

        public Pair(T key, T1 value){
             this.key= key;
             this.value = value;
        }
    }





}
