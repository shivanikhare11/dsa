package study.DivideAndConquer;

public class SortedArrayToBST {

    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

        TreeNode out = sortedArrayToBSTalgo(nums, 0, nums.length-1);

        System.out.println(out.val);


    }

    public static TreeNode sortedArrayToBSTalgo(int[] nums, int i, int j){

        if(i>j) return null;


        int mid = i + (j-i)/2;

        TreeNode  root =  new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTalgo(nums, i, mid -1);
        root.right = sortedArrayToBSTalgo(nums, mid+1, j);

        return root;


    }
}
