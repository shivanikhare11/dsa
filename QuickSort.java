package study.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7};
        sort(arr, 0, arr.length-1);
        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr, int l, int r) {

        if (l< r){

            int pi = partition(arr, l,r);
            sort(arr, l, pi-1);
            sort(arr, pi+1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {

        int pi = arr[r];
        int i = l-1;
        for (int j = l ; j <r; j++){

            if (arr[j] < pi){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, r);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
