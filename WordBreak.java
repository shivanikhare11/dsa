package study.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static void main(String[] args) {

        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");

        System.out.println(wordBreak(s, wordDict));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> ispresent = new HashSet<>();
        return helper(s, wordDict, ispresent);

    }

    public static boolean helper(String s, List<String> wordDict,  Set<String> ispresent){

        if(s.length() ==0) return true;

        if (ispresent.contains(s)) return false;


        for(int i = 1; i <= s.length();i++){
            String st = s.substring(0, i);
            System.out.println("st1 -> " + st);
                if( wordDict.contains(st)) {
                    if(helper(s.substring(i), wordDict, ispresent));
                    return true;
                }
        }
        ispresent.add(s);
        return false;
    }
}
