package study.dp;

public class minSwap {

    public static void main(String[] args) {

        int[] nums1 = {1,3,5,4};
        int[] nums2 = {1,2,3,7};

        System.out.println(minSwap(nums1, nums2));
    }



    public static int minSwap(int[] nums1, int[] nums2) {

        int i =nums1.length-1;
        int minsSwap =0;


        while(i >0){

            if(nums1[i-1] >= nums1[i]  ){
                if(nums1[i-1] < nums2[i]   && nums2[i-1] <  nums1[i]){
                    int temp = nums1[i-1];
                    nums1[i-1] = nums2[i-1];
                    nums2[i-1] =temp;
                    minsSwap++;
                }
            }
            if(nums2[i-1] >= nums2[i]  ){
                if(nums2[i-1] < nums1[i]  && nums1[i-1] <  nums2[i]){
                    int temp = nums1[i-1];
                    nums1[i-1] = nums2[i-1];
                    nums2[i-1] =temp;
                    minsSwap++;
                }

            }
            i--;
        }

        return minsSwap;

    }
}
