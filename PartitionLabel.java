package study.twoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {

    public static void main(String[] args) {

        String s = "eaaaabaaec";

        List<Integer> list = partitionLabels(s);

        for (Integer l : list){

            System.out.println(l);
        }

        Map<Integer, Integer> map = new HashMap<>();



    }

    public static List<Integer> partitionLabels(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            map.put(s.charAt(i), i);
        }

        int pointer = map.get(s.charAt(0));
        int lastPointer= 0;



        List<Integer> list = new ArrayList<>();


        for(int i = 0; i < s.length();i++){

            if(map.get(s.charAt(i)) >  pointer){
                pointer = map.get(s.charAt(i));
            }

            if(i == pointer){
                if(lastPointer == 0){
                    list.add(pointer+1);
                }
                else{
                    list.add(pointer - lastPointer+1);
                }
                lastPointer = pointer+1;

            }



        }

        return list;

    }
}
