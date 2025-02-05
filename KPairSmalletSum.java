package study.heap;

import java.util.*;

public class KPairSmalletSum {
    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        int k =3;

        List<List<Integer>> list = kSmallestPairs(nums1,nums2,k);
        for(int i =0; i < list.size(); i++){

            for (int j = 0; j < list.get(i).size(); j++){
                System.out.println(list.get(i).get(j));
            }
        }




    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>(){

            @Override
            public int compare(List<Integer> l1, List<Integer> l2 ){

                int sum1 = l1.get(0)+ l1.get(1);
                int sum2 = l2.get(0)+ l2.get(1);
                return Integer.compare(sum1,sum2);
            }
        });

        List<List<Integer>> list = new ArrayList<>();

        if(nums1.length==0 || nums2.length==0 || k ==0 ) return list;

        for(int i =0; i < nums1.length && i < k ;i++) {
            pq.add(Arrays.asList(nums1[i], nums2[0], 0));

        }

        while(k > 0 && !pq.isEmpty() ){

            List<Integer> sublist= pq.poll();
            list.add(Arrays.asList(sublist.get(0), sublist.get(1)));
            if(sublist.get(2) == nums2.length -1) continue;
            pq.offer(Arrays.asList(sublist.get(0), nums2[sublist.get(2) +1], sublist.get(2) +1));
            k--;
        }

        return list;
    }
}
