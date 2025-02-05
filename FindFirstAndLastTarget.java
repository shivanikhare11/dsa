package study.binarySearch;

public class FindFirstAndLastTarget {

    public static void main(String[] args) {

//        int[] nums = {5,7,7,8,8,10};
        int[] nums = {1};
        int target= 1;

        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);


    }

    private static int start = Integer.MAX_VALUE;
    private static int end =Integer.MIN_VALUE;

    public static int[] searchRange(int[] nums, int target) {


        helper(nums, target, 0, nums.length-1);
        return new int[]{start, end};

    }
    public static void helper(int[] nums, int target, int left , int right){

        if(left <0 || right >= nums.length) return;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(target == nums[mid] ){
                start = Math.min(start, mid);
                end = Math.max(end, mid);
                if(mid-1 >= 0 && target <= nums[mid-1]) {
                    right = nums[mid-1];
                    helper(nums, target, left, right);
                }
                if(mid+1< nums.length && target >= nums[mid+1]){
                    left= nums[mid+1];
                    helper(nums, target, left, right);
                }
                if(left == right) break;
            }else if(target < nums[mid]){
                right = mid -1;
            }else {
                left = mid+1;
            }

        }


    }
}
