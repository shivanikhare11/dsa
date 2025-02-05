package study.bst;

public class LowestCommonAncestor {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){};
        public TreeNode (int val){
            this.val = val;
        }
        public TreeNode (int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right= new TreeNode(1);
        node.left.left = new TreeNode(6);
        node.left.right = new TreeNode(2);
        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(4);
        node.right.left= new TreeNode(0);
        node.right.right= new TreeNode(8);

        TreeNode p = node.left.right;
        TreeNode q= node.right.left;

       TreeNode result=  lowestCommonAncestor(node, p, q);

        System.out.println(result.val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root ==p || root ==q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right ==null ? left : root;

    }
}
