package study.dp;

public class MaximalSquare {

    public static void main(String[] args) {

        char[][] matrix= {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        System.out.println(maximalSquare(matrix));

    }

    public static int maximalSquare(char[][] matrix) {

        int max = matrix[0][0] -'0';

        for(int i =0; i < matrix.length; i++){

            for(int j =0; j <matrix[0].length ; j++){

                if(j-1 >= 0 && i -1 >=0 ){

//                    System.out.println( (Math.min ( Math.min(matrix[i-1][j],matrix[i][j-1]), matrix[i-1][j-1] ) - '0') +  matrix[i][j] -'0');



                    int out = (Math.min ( Math.min(matrix[i-1][j],matrix[i][j-1]), matrix[i-1][j-1] ) - '0') +  (matrix[i][j] -'0');
                    System.out.println(out);

                    matrix[i][j] =  (char) ('0' + out);

                    max = Math.max(max, out);

                }
            }
        }

        return max;

    }
}
