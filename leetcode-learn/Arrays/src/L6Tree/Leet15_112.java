package L6Tree;

public class Leet15_112 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return traversal(root, targetSum);

        }

        public boolean traversal(TreeNode root, int count){
            if(root == null) return false;
            count -= root.val;
            if(root.left == null && root.right == null && count == 0) return true;
            if(root.left == null && root.right == null && count != 0) return false;

            if(root.left != null){
                if(traversal(root.left, count)) return true;
            }
            if(root.right != null){
                if(traversal(root.right, count)) return true;
            }
            return false;
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
