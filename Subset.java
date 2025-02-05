package study.recursion;

import java.util.*;
public class Subset {

    public static List<List<Integer>> list = new ArrayList<>();


    public static void main(String[] args) {

        int[] nums = {1,2,3};
        subsets(nums);

        for (int i = 0 ; i < list.size();i++){

            for (int j = 0 ; j < list.get(0).size();j++){

                System.out.println(list.get(i).get(j));

            }
        }
    }


    private static List<List<Integer>> subsets(int[] nums) {

        //  List<List<Integer>> list = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), list);
        return list;

    }

    private static void helper(int[] nums, int i, List<Integer> sublist, List<List<Integer>> list){

        if(i == nums.length){
            list.add(new ArrayList<>(sublist));
            return;
        }

        helper(nums, i+1, sublist, list);
        sublist.add(nums[i]);
        helper(nums, i+1, sublist, list);
        sublist.remove(sublist.size()-1);

    }
}
