package study.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7};
        sort(arr);
        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr){

        for (int i = 0 ; i < arr.length-1; i++){

            boolean swapped = false;

            for (int j =0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped= true;

                }
            }
            if (!swapped) break;
        }


    }

    private static void  swap(int[] arr, int i , int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
