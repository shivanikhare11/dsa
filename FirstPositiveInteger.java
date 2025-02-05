package study.array;

import java.util.PriorityQueue;

public class FirstPositiveInteger {

    public static void main(String[] args) {

        int[] nums = {1,2,2,1,3,1,0,4,0};

        System.out.println(firstMissingPositive(nums));

    }

    public static int firstMissingPositive(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i :nums){
            if (i <=0 ) continue;
            pq.add(i);
        }
        int minPositiveInterger = 1;

        while (!pq.isEmpty()){


            if(minPositiveInterger < pq.peek()){
                return minPositiveInterger;
            }else if(minPositiveInterger == pq.peek()){
                minPositiveInterger = pq.peek()+1;
                pq.poll();
            }else{
                pq.poll();
            }

        }
        return minPositiveInterger;



    }

}
