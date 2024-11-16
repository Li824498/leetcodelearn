package L8Greedy;

public class Leet17_968 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int minCameraCover(TreeNode root) {
            if(traversal(root) == 0) {
                result++;
            }
            return result;
        }
        int result = 0;
        public int traversal(TreeNode root) {
            if(root == null) return 2;

            int left = traversal(root.left);
            int right = traversal(root.right);

            if(left == 2 && right == 2) return 0;
            if(left == 0 || right == 0) {
                result++;
                return 1;
            }
            if(left == 1 || right == 1) return 2;
            return -1;
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
