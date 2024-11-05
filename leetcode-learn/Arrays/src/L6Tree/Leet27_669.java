package L6Tree;

public class Leet27_669 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if(root == null) return null;

            if(root.val < low){
                return trimBST(root.right, low, high);
            }
            if(root.val > high){
                return trimBST(root.left, low, high);
            }

            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);

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
