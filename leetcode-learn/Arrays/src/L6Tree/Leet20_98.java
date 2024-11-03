package L6Tree;

public class Leet20_98 {
    public static void main(String[] args) {

    }

    static class Solution {
        TreeNode max;
        public boolean isValidBST(TreeNode root) {
            if(root == null) {
                return true;
            }

            boolean left = isValidBST(root.left);
            if(!left) {
                return false;
            }

            if(max != null && max.val >= root.val){
                return false;
            }
            max = root;

            boolean right = isValidBST(root.right);
            return right;
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
