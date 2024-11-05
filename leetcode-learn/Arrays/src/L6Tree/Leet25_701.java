package L6Tree;

public class Leet25_701 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root == null){
                TreeNode node = new TreeNode(val);
                return node;
            }

            if(val < root.val) {
                root.left = insertIntoBST(root.left, val);
            }
            if(val > root.val) {
                root.right = insertIntoBST(root.right, val);
            }
            return root;
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
