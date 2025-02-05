package study.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums  = {1,2,3};


        List<List<Integer>> list = permute(nums);

        for(int i =0; i < list.size(); i++){

            for (int j = 0; j < list.get(i).size(); j++){
                System.out.println(list.get(i).get(j));
            }
        }


    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        helper(nums, list, new ArrayList<>());
        return list;
    }

    public static void helper(int[] nums, List<List<Integer>> list, List<Integer> subList){

        if(subList.size() == nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }

        for(int i =0 ;i < nums.length; i++){
            if(subList.contains(nums[i])) continue;
            subList.add(nums[i]); //1,2,3
            helper(nums, list, subList);
            subList.remove(subList.size()-1);
        }

    }
}
