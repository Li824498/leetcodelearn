package L6Tree;

public class Leet13_404 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return traversal(root);
        }

        public int traversal(TreeNode root){
            if(root == null) return 0;
            if(root.left == null && root.right == null) return 0;

            int leftNum = traversal(root.left);
            int rightNum = traversal(root.right);
            int midvalue=0;
            if(root.left != null && root.left.left == null && root.left.right == null) midvalue = root.left.val;
            int sum = leftNum + rightNum + midvalue;
            return sum;
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
