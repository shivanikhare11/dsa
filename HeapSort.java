package study.sorting;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {25,1,3,56,7,0};

        heapSort(arr);

        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }

    }

    private static void heapSort(int[] arr){
        int n = arr.length;

        for (int i =(n/2)-1; i >=0; i-- ){
            heapify(arr, n, i);
        }

        for (int i = n-1; i > 0; i-- ){
            swap(arr, 0, i);
            heapify(arr, i, 0 );
        }

    }

    public static void heapify(int[] arr, int n, int i){

        int largest = i;
        int l = 2*i+1;
        int r= 2*i+2;

        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }

        if (largest !=i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
