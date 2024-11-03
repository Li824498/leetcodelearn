package L6Tree;

public class Leet21_530 {
    public static void main(String[] args) {

    }
    static class Solution {
        int result = Integer.MAX_VALUE;
        TreeNode pre;
        public int getMinimumDifference(TreeNode root) {
            if(root == null) return 0;
            traversal(root);
            return result;
        }

        public void traversal(TreeNode cur){
            if(cur == null) return;
            traversal(cur.left);
            if(pre != null){
                result = Math.min(result, cur.val - pre.val);
            }
            pre = cur;
            traversal(cur.right);
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
