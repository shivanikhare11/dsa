package study.hashMap;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public static void main(String[] args) {

       int[]  nums = {1,2,3,1,2,3};
       int k = 2;
         boolean out = containsNearbyDuplicate(nums, k);
        System.out.println(out);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums.length == 1) return false;
        if(k ==0) return false;

        int i =0;
        int j ;

        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);

        for(j =1 ;j<=k;j++){

            if(set.contains(nums[j])) return true;
            else set.add(nums[j]);
        }


        while(j < nums.length){

            set.remove(nums[i]);
            if(set.contains(nums[j])) return true;
            else {
                set.add(nums[j]);
                j++;
                i++;
            }
        }
        return false;


    }
}
