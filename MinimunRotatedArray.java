package study.binarySearch;

public class MinimunRotatedArray {
    public static void main(String[] args) {

        int[] nums = {2,1};
        System.out.println(findMin(nums));

    }

    public static int findMin(int[] nums) {

        int left =0;
        int right = nums.length -1;
        int min = nums[0];

        while(left <= right){
            int mid = left + (right -left)/2;
            min = Math.min(min, nums[mid]);

            if(nums[left] <= nums[right]){
                min = Math.min(min, nums[left]);
                return min ;
            }else{
                left = mid+1;
            }
        }
        return min;

    }
}
