package study.sorting;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        float[]  arr = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};

        bucketSort(arr);

        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    private static void bucketSort(float[] arr) {
        int n = arr.length;

        List<Float>[] buckets = new ArrayList[n];

        for (int i = 0 ; i < n; i++){
            buckets[i] = new ArrayList<>();
        }


        for (int i =0 ; i < arr.length; i ++){
            int temp = (int) (arr[i]*10);
            buckets[temp].add(arr[i]);
        }

        for (int i = 0 ; i < n; i++){
            insertionSort(buckets[i]);
        }

        int idx =0;

        for (int i = 0 ;i < n; i++){
            for (int j = 0; j < buckets[i].size(); j++){
                arr[idx] = buckets[i].get(j);
                idx++;
            }
        }
    }

    private static void insertionSort(List<Float> bucket) {

        for (int i = 1 ; i < bucket.size(); ++i){

            float key = bucket.get(i);
            int j = i - 1;
                while (j >= 0 && bucket.get(j) > key){
                    bucket.set(j + 1, bucket.get(j));
                    j--;
                }
            bucket.set(j + 1, key);
            }

    }

}
