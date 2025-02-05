package study.hashMap;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Integer[] c = new Integer[255];
        Arrays.fill(c, 0);

        for(int i =0 ; i < s.length(); i++){
            char c1 = s.charAt(i);
            System.out.println(c1);
            c[c1-'0']++;
        }

        for(int i =0 ; i < t.length(); i++){
            char c1 = s.charAt(i);
            if(c[c1-'0'] ==0) return false;
            c[c1-'0']--;
        }

        return true;


    }
}
