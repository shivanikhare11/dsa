package study.binarySearch;

public class SearchInRotateSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        int left =0;
        int right = nums.length -1;

        while(left < right){

            int mid = left + (right-left)/2;

            if(nums[mid] == target) return mid;
            else if( target < nums[mid]){
                if(target <nums[left]) left = mid+1;
                else right = mid-1;
            }else {
                if (target > nums[right]) right = mid -1;
                else left = mid + 1;
            }
        }

        return nums[left] == target ? left : -1;

    }
}
