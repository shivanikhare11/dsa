package study.dp;

import java.util.Arrays;

public class LongestPali {

    public static void main(String[] args) {
        String s = "babad";

         longestPalindrome(s);


    }

    public static String longestPalindrome(String s) {

        int n =s.length() ;
        char[][] pali = new char[n][n];

        for(int i =0 ; i <n; i++){
            Arrays.fill(pali[i], '_');
        }


        for(int i =n-1 ; i >=0 ; i--){
            for(int j = 0 ; j <n ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    pali[i][j] = s.charAt(i);
                }
            }
        }

        for (int i =0; i < n; i++) {
            for (int j =0; j < n; j++) {
                System.out.println(pali[i][j]);
            }
            System.out.println("______");

        }

        int max = 0;

         for(int i =0; i < n; i++){

             int diff = 0-i; //0

             for(int j =0; j < n; j++){

                 if(j-i == diff);

             }
         }
        return "";

}

}
