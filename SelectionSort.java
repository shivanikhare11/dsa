package study.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {25,1,3,56,7,0};

        sort(arr);

        for (int i = 0 ; i < arr.length; i ++){

            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr)

    {

        for(int i = 0 ; i < arr.length -1;i ++){

            int min_pos = i;

            for (int j = i+1; j < arr.length; j++){
                if(arr[min_pos] > arr[j]) min_pos = j;
            }

            if (min_pos != i){
                int temp = arr[min_pos];
                arr[min_pos] =arr[i];
                arr[i] = temp;
            }
        }

       }
}
