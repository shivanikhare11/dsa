package study.array;

import java.util.*;

public class SpiralOrder {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        int startRow = 0;
        int endRow = matrix.length-1;

        int startCol =0;
        int endCol = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();

//        while(startRow <= endRow && startCol <= endCol ){
        while(list.size() < matrix.length*matrix[0].length){

            int i = startCol;
            while( i <= endCol && list.size() < matrix.length*matrix[0].length){
                list.add(matrix[startRow][i]);
                i++;
            }
            startRow= startRow+1;

            int j = startRow;
            while(j <= endRow && list.size() < matrix.length*matrix[0].length){
                list.add(matrix[j][endCol]);
                j++;
            }
            endCol=endCol-1;

            int k=endCol;
            while(k >= startCol && list.size() < matrix.length*matrix[0].length){
                list.add(matrix[endRow][k]);
                k--;
            }

            endRow= endRow-1;

            int m = endRow;
            while(m >= startRow && list.size() < matrix.length*matrix[0].length){
                list.add(matrix[m][startCol]);
                m--;
            }
            startCol = startCol+1;

        }

        System.out.println(list.size());




    }


}
