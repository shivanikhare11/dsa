package study.hashMap;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();




        for(int i =0; i < strs.length; i++){

            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String s = new String(str);

            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }

        return new ArrayList<>(map.values());

    }
}
