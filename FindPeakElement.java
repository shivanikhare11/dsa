package study.binarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(findPeakElement(nums));

    }

    public static int findPeakElement(int[] nums) {

        int i =0;
        int j = nums.length-1;

        while(i <j){
            int m = i+ (j-i)/2;
            if(nums[m] <= nums[m+1]){
                i = m+1;
            }else{
                j=m;
            }
        }

        return nums[i];

    }
}
