package L6Tree;

public class Leet8_104 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }

            int leftheight = maxDepth(root.left);
            int rightheight = maxDepth(root.right);
            return 1 + Math.max(leftheight, rightheight);

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
