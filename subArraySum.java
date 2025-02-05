package study.array;

import java.util.*;

public class subArraySum {

    public static void main(String[] args) {

        int[] nums= {1,1,1};
        int k = 2;

            int sum = 0;
            int ans = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            for(int j=0;j<nums.length;j++){
                sum += nums[j];
                if(map.containsKey(sum -k)){
                    ans += map.get(sum-k);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }

        System.out.println(ans);


    }

}
