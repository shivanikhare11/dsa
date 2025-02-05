package study.twoPointers;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct {

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4};
        int k=3;

        int out = subarraysWithKDistinct(arr,k);

        System.out.println(out);



    }

    public static int subarraysWithKDistinct(int[] nums, int k) {


        Map<Integer, Integer> map = new HashMap<>();

        int p =0;
        int out = 0;

        for(int i = 0 ; i < nums.length; i++){

            if(map.size() < k){

                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }else{
                    map.put(nums[i], 1);
                }
            }

            if(map.size() == k){

                if (!map.containsKey(nums[i])) {

                    while(map.size() == k){
                        out = out+1;
                        map.put(nums[p], map.get(nums[p])-1);
                        if(map.get(nums[p]) == 0) map.remove(nums[p]);
                        p++;
                    }
                    i--;

                }else{
                    map.put(nums[i], map.get(nums[i])+1);
                    out = out+1;
                }

            }
        }

        return out;

    }
}
