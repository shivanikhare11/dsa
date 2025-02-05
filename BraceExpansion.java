package study.strings;

import java.util.LinkedList;
import java.util.Queue;

public class BraceExpansion {
    public static void main(String[] args) {

        String s = "{a,b}c{d,e}f";

        String[] out = expand(s);

        for(int i=0; i < out.length; i++){
            System.out.println(out[i]);
        }


    }

    public static String[] expand(String s) {

        Queue<StringBuilder> q = new LinkedList<>();

        int i =0;

        while(i < s.length()){

            if(s.charAt(i) == '{'){
                int size = q.size();
                int j =i+1;

                if(size ==0){
                    while(j < s.length() && s.charAt(j) != '}'){
                        if(Character.isLetter(s.charAt(j))){

                            q.offer(new StringBuilder(Character.toString(s.charAt(j))));
                        }
                        j++;
                    }
                }else{

                    while(size>0){
                        j = i+1;
                        String sb = q.poll().toString();
                        while(j < s.length() && s.charAt(j) != '}'){
                            if(Character.isLetter(s.charAt(j))){
                                StringBuilder st = new StringBuilder(sb);
                                q.offer(st.append(Character.toString(s.charAt(j))));
                            }
                            j++;
                        }
                        size--;
                    }
                }
                i =j;
                i++;
            }else{
                int size = q.size();
                int j =i;
                StringBuilder sb = new StringBuilder();
                while(j < s.length() && s.charAt(j) != '{' &&  s.charAt(j) != '}' ){
                    if(Character.isLetter(s.charAt(j))) {
                        sb.append(Character.toString(s.charAt(j)));
                    }
                    j++;
                }
                if(size==0){
                    q.offer(sb);
                }else{

                    while(size >0){
                        String st = q.poll().toString();
                        StringBuilder stt = new StringBuilder(st);
                        stt.append(sb);
                        q.offer(stt);
                        size--;
                    }

                }
                i =j;
            }
        }
         int size = q.size();
        String[] result = new String[q.size()];

        for(i=0; i < size; i++){
            result[i] = q.poll().toString();
        }
        return result;

    }
}
