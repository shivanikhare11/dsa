package study.twoPointers;

public class subarraySum {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(findMaxAverage(nums, 1));

    }
    public static double findMaxAverage(int[] nums, int k) {

        int i =0;
        int j =0;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        while(j < nums.length){
            if(j-i < k){
                sum+=nums[j];
                j++;
            }else{
                maxSum =Math.max(maxSum,  sum);
                sum = sum -nums[i];
                i++;
            }
        }
        if((j-i)==k)
            maxSum =Math.max(maxSum,  sum);
        return (double) maxSum/k;



    }
}
