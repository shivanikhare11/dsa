package study.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {
    public static void main(String[] args) {

        String digits = "23";
        List<String> list = letterCombinations(digits);

        for(int i =0; i < list.size(); i++){
                System.out.println(list.get(i));

        }


    }

    public static List<String> letterCombinations(String digits) {

        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();
        helper(digits, keypad, 0, list, "");
        return list;

        // l = digits.length();
        // _ _  a _, b _ , c _

        // a -> d,e,f return , b-> d,e,f -> return


    }

    public static void helper(String digits, String[] keypad, int idx, List<String> list, String s){

        if(idx== digits.length()) {
            list.add(s);
            return;
        }

        String combi = keypad[digits.charAt(idx) - '0'];

        for(int i =0 ; i < combi.length(); i++ ){
            s = s+ combi.charAt(i);
            helper(digits, keypad, idx+1, list, s);
            s = s.substring(0, s.length() - 1);
        }

    }
}
