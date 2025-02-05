package study.array;

public class JumpGame {

    public static void main(String[] args) {

        int[] nums = {2,0,0};

        System.out.println( helper(nums, 0));

    }

    public static boolean helper(int[] nums, int i ){


        for(int j =1; j <= nums[i] ; j++){

            if( i+j == nums.length-1) {
                return true;

            }
            return helper (nums, i+j);
        }
        return false;
    }
}
