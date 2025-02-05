package study.array;

public class ClosetSum {
    public static int  currentClosestSum = Integer. MAX_VALUE;
    public static int  closetSum = 0;



    public static void main(String[] args) {
        int[] nums = {0,0,0};

        int out = threeSumClosest(nums, 1);
        System.out.println(out);

    }

    public static int threeSumClosest(int[] nums, int target) {

        for(int i =0 ; i < nums.length -2;i++){

            int sum = nums[i];
            helper(nums, target, sum, i+1, 1);

        }
        return closetSum;

    }

    public static void helper(int[] nums, int target, int sum, int i, int count){

        if(count == 3){
            int diff = target- sum;
            diff = diff < 0 ? diff*-1 :  diff;
            if(diff < currentClosestSum){
                currentClosestSum = diff;
                closetSum = sum;
            }
            return;
        }

        if(i == nums.length){
            return;
        }

        sum= sum+nums[i];
        count = count+1;
        helper(nums, target, sum, i+1, count);
        sum= sum - nums[i];
        count = count-1;
        helper(nums, target, sum, i+1, count);




    }
}
