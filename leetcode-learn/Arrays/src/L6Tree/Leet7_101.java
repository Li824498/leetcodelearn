package L6Tree;

public class Leet7_101 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null){
                return true;
            }
            return compare(root.left, root.right);

        }

        public boolean compare(TreeNode left, TreeNode right){
            if(left != null && right == null) return false;
            if(left == null && right != null) return false;
            if(left == null && right == null) return true;
            if(left.val != right.val) return false;

            boolean outside = compare(left.left, right.right);
            boolean inside = compare(left.right, right.left);
            return outside && inside;
        }
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
