package study.hashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abbc", s = "dog cat cat dog";
        boolean output = wordPattern(pattern, s);
        System.out.println(output);

    }


    public static boolean wordPattern(String pattern, String s) {

        String[] str= s.split(" ");

        if(pattern.length() != str.length) return false;

        Map<Character, String> map = new HashMap<>();

        for(int i =0 ; i < pattern.length(); i++){

            char key = pattern.charAt(i);

            if(map.containsKey(key)){
                if(!map.get(key).equals(str[i])) return false;
            }
            else{
                System.out.println( map.put(key, str[i]));
                map.put(key, str[i]);
            }
        }
        return true;

    }
}
