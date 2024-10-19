package L6Tree;

public class Leet6_226 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return null;
            }

            swapChildren(root);
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

        public void swapChildren(TreeNode root){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
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
