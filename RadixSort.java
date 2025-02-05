package study.sorting;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7,0};

       int n = arr.length;
        radixSort(arr,n);

        for (int i = 0 ; i < n; i ++){

            System.out.println(arr[i]);
        }

    }



    public static void radixSort(int[] arr, int n){

        int max = arr[0];

        for (int i = 0 ;i < n; i++)
            max = Math.max(max, arr[i]);

        for (int i= 1 ; max/i > 0 ; i=i*10)
            countSort(arr, i,n);

    }

    public static void countSort(int[] arr, int m, int n){

        int[] output = new int[arr.length];
        int[] countArr = new int[10];
        Arrays.fill(countArr, 0);

        for (int i = 0 ;i < arr.length; i ++ )
            countArr[(arr[i]/m) %10] ++;

        for (int i =1 ;i < 10; i++)
            countArr[i] += countArr[i-1];

        for (int i = n-1 ; i >= 0; i --){
            output[countArr[(arr[i]/m) %10] -1 ] =arr[i];
            countArr[(arr[i]/m) %10] --;
        }

        for (int i = 0 ;i < n; i++)
            arr[i] = output[i];

    }


}
