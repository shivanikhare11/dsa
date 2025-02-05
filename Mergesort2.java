package study.sorting;

public class Mergesort2 {

    public static void main(String[] args) {
        int[] arr = {25, 1, 3, 56, 7, 0};

        int l = 0;
        int r = arr.length-1;





    }

    public static void sort(int[] arr, int l , int r){

        if(l<r){
            int m = (l+r)/2;
          sort(arr, l, m);
          sort(arr, m+1, r);
          merge(arr, l, m, r);

        }
    }

    public static void merge(int[] arr, int l, int m , int r){
        int left = m-l+1;
        int right = r-m;

        int[] leftArry = new int[left];
        int[] rightArry = new int[right];

        for(int i =0 ; i < left; i++){
            leftArry[i] = arr[l+i];
        }
        for(int i =0 ; i < right; i++){
            rightArry[i] = arr[m+i+1];
        }

    }




}
