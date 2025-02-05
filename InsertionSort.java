package study.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7};
        sort(arr);
        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr){

        for (int i = 0 ; i < arr.length-1; i ++){

            int j  =i+1;

            if (arr[i] > arr[j]){
                while (j > 0){
                    if (arr[j] < arr[j-1]){
                        swap(arr, j, j-1);
                    }else {
                        break;
                    }
                    j--;
                }
            }

        }

    }

    private static void  swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
