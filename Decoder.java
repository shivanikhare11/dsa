package src;

import java.util.Stack;

public class Decoder {

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        System.out.println(decodeString(s));

    }
    public static String decodeString(String s) {

        Stack<Character> st = new Stack<>();


        StringBuilder str = new StringBuilder();
        int i =0;
        boolean addLast =false;
        int openBraces =0;


        while( i < s.length()){

            if(s.charAt(i) =='[') openBraces++;
            st.push(s.charAt(i));


            if(st.peek() == ']') {
                if(openBraces>1) addLast =false;
                st.pop();

                StringBuilder temp = new StringBuilder();
                if(!addLast) temp.append(str);

                while(st.peek() != '['){
                    temp.insert(0, st.pop());
                }

                st.pop();
                int count = st.pop() -'0';
                StringBuilder temp2 = new StringBuilder();
                while(count >0){
                    temp2.append(temp);
                    count--;
                }
                str.append(temp2);
                openBraces--;
            }
            if(openBraces ==0) addLast =true;
            i++;
        }

        return str.toString();

    }
}
