package study.binarySearch;

public class FindMedian {
    public static void main(String[] args) {

        int[] nums2 = {};
        int[] nums1 = {2};

        System.out.println(binarySearch(nums1, nums2));

    }

    public static double binarySearch(int[] nums1, int[] nums2) {

        int n1 =nums1.length, n2 =nums2.length;

        if(n1 > n2){
            binarySearch(nums2, nums1);
        }

        int left = 0, right = n1;

        while(left <= right){

            int partitionX = (left +right)/2;
            int partitionY = (n1+n2+1)/2 - partitionX;

            int l1 = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX-1];
            int l2 = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY-1];

            int r1 = partitionX == n1 ? Integer.MAX_VALUE : nums1[partitionX];
            int r2 = partitionY == n2 ? Integer.MAX_VALUE : nums2[partitionY];

            if(l1<= r2 && l2<=r1){
                if((n1+n2)%2 ==0)
                    return ((double)(Math.max(l1,l2) + Math.min(r1,r2))/2);
                else
                    return (double) Math.max(l1,l2);
            }else if(l1>r2){
                right = partitionX-1;
            }else {
                left = partitionX+1;
            }
        }

        return 0;
    }


}
