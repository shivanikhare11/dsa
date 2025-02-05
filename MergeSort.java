package study.sorting;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7,0};

        int l = 0;
        int r  = arr.length-1;
        sort(arr,l,r);

        for (int i = 0 ; i < arr.length; i ++){

            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr, int l, int r){

        if(l< r){
            int m = (l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }
    private static void merge(int[] arr, int l, int m, int r){

        int n1 = m-l+1;
        int n2= r-m;

        int[] leftArr  = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0 ; i < n1; i++){
            leftArr[i] = arr[l+i];
        }

        for (int i = 0 ; i < n2; i++){
            rightArr[i] = arr[m+i+1];
        }

        int i =0 ;
        int j =0;
        int k = l;

        while (i < n1 && j < n2 ){

            if (leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i <n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j <n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }


    }



}
