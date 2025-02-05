package study.array;

public class SubarraySumDivisibleByK {
    public static int count = 0;


    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;

        helper(nums, k, 0, 0);

        System.out.println(count);
    }

    public static void helper(int[] nums, int k, int i, int sum){

        if(sum%k ==0){
            count+=1;
        }

        if(i ==nums.length){
            return;
        }

        sum +=nums[i];
        helper(nums, k, i+1,sum);

        sum-=nums[i];
        helper(nums, k, i+1,sum);

    }
}
