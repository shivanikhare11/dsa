package study.kadanes;

public class MaximumSumCircularSubarray {

    public static void main(String[] args) {
//        int[] nums = {1,-2,3,-2};
        int[] nums = {-3,-2,-3};
        System.out.println(maxSubarraySumCircular(nums));

    }

    public static int  maxSubarraySumCircular(int[] nums) {

        int max = nums[0];
        int n = nums.length;
        int pos =0;
        int i =1;
        int j =0;

        while(j < 2*n -1 && i != pos) {

            if(nums[i] < nums[i] + nums[(i - 1 + n) % n]){
                nums[i] = nums[i] + nums[(i - 1 + n) % n];

            }else{
                pos =i;
            }
            max = Math.max(nums[i], max);
            i = (i + 1) % n;
            j++;
        }
        return max;
    }
}
