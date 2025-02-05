package study.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static void main(String[] args) {

        int n = 4, k = 2;

        List<List<Integer>> list = combine(n,k);


        for(int i =0; i < list.size(); i++){

            for (int j = 0; j < list.get(i).size(); j++){
                System.out.println(list.get(i).get(j));
            }
        }

    }
    public static  List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> list = new ArrayList<>();

        helper(n, k, list, new ArrayList<>(), 1);
        return list;
    }
    public static void helper(int n, int k, List<List<Integer>> list , List<Integer> sublist, int idx){

        if(sublist.size() == k) {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = idx; i <= n; i++){
            sublist.add(i);
            helper(n, k, list, sublist, i+1);
            sublist.remove(sublist.size()-1);
        }
    }

}
