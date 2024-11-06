package L6Tree;

public class Leet29_538 {
    public static void main(String[] args) {

    }
    static class Solution {
        public TreeNode convertBST(TreeNode root) {
            traversal(root);
            return root;

        }

        int pre = 0;
        public void traversal(TreeNode cur) {
            if(cur == null) return;

            traversal(cur.right);
            cur.val += pre;
            pre = cur.val;
            traversal(cur.left);
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
