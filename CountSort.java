package study.sorting;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = {25,1,3,56,7};
        int[] out = sort(arr);
        for (int i = 0 ; i < out.length; i ++){
            System.out.println(out[i]);
        }
    }

    private static int[] sort(int[] arr) {

        int m = 0;

        for (int i = 0 ; i < arr.length; i++){
            m = Math.max(arr[i], m);
        }

        int[] countArr = new int[m+1];

        for (int i = 0 ; i < arr.length;i++){
            countArr[arr[i]] +=1;
        }

        for (int i =1 ; i <=m ; i++){
            countArr[i] += countArr[i-1];
        }

        int[] output = new int[arr.length];

        for (int i =arr.length-1; i >= 0; i--){
            int pos = countArr[arr[i]];
            output[pos-1] = arr[i];
            countArr[arr[i]] -=1;
        }

        return output;


    }


}
