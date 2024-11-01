package L6Tree;

public class Leet14_513 {
    public static void main(String[] args) {

    }
    static class Solution {
        private int value = 0;
        private int Deep = -1;
        public int findBottomLeftValue(TreeNode root) {
            value = root.val;
            findLeftVaule(root, 0);
            return value;
        }

        public void findLeftVaule(TreeNode root, int depth){
            if(root == null) return;
            if(root.left == null && root.right == null) {
                if(depth > Deep){
                    Deep = depth;
                    value = root.val;
                }
            }

            if(root.left != null) findLeftVaule(root.left, depth + 1);
            if(root.right != null) findLeftVaule(root.right, depth + 1);
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
