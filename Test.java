package study.array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String s = "DEF";
//        System.out.println(s.charAt(1) -'A' );

        StringBuilder s1 = new StringBuilder("DEF");
//        System.out.println(s1.reverse().toString());

        int[][] test = {{1,2},{2,3},{3,4},{1,3}};

        Arrays.sort(test, (a,b) -> Integer.compare(a[1],5));

        for (int i = 0 ; i < test.length; i++){
            System.out.println(test[i][0] + "," + test[i][1]);
        }

    }
}
