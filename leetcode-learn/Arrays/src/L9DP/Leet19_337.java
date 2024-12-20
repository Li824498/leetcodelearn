package L9DP;

public class Leet19_337 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int rob(TreeNode root) {
            int[] res = robAction(root);

            return Math.max(res[0], res[1]);

        }
        public int[] robAction(TreeNode root){
            int[] res = new int[2];

            if(root == null) return res;

            int[] left = robAction(root.left);
            int[] right = robAction(root.right);

            res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            res[1] = left[0] + right[0] + root.val;

            return res;
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
