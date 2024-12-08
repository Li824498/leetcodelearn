package L6Tree;

public class Leet11_110 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;

        }

        public int getHeight(TreeNode root){
            if(root == null){
                return 0;
            }
            int leftHeight = getHeight(root.left);
            if(leftHeight == -1){
                return -1;
            }
            int rightHeight = getHeight(root.right);
            if(rightHeight == -1){
                return -1;
            }
            if(Math.abs(leftHeight - rightHeight) > 1){
                return -1;
            }else{
                return 1 + Math.max(leftHeight, rightHeight);
            }
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

    static class Solution2 {
        public boolean isBalanced(TreeNode root) {
            return traversal(root) != -1;
        }

        public int traversal(TreeNode root) {
            if(root == null) return 0;

            int left = traversal(root.left);
            int right = traversal(root.right);
            if(left == -1 || right == -1) return -1;
            if(Math.abs(left - right) > 1) return -1;

            return Math.max(left, right) + 1;
        }
    }
}
