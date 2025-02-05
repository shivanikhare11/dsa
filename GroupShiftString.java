package study.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftString {
    public List<List<String>> groupStrings(String[] strings) {

        Map<String, List<String>> patternMap= new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(String s : strings){
            String pattern = getPattern(s);
            List<String> currList= patternMap.getOrDefault(pattern, new ArrayList<>());
            currList.add(s);
            patternMap.put(pattern, currList);

        }

        for(Map.Entry<String, List<String>> map : patternMap.entrySet()){
            list.add(map.getValue());
        }

        return list;

    }

    public static String getPattern(String s){

        if(s.length() ==1) return " ";
        StringBuilder str = new StringBuilder();

        for(int i =1 ; i < s.length(); i++){
            int diff = s.charAt(i-1) - s.charAt(i);
            str.append(diff);

        }
        return str.toString();
    }
    }

