package L6Tree;

public class Leet24_235 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(p.val < root.val && q.val < root.val){
                return lowestCommonAncestor(root.left, p, q);
            }
            if(p.val > root.val && q.val > root.val){
                return lowestCommonAncestor(root.right, p, q);
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
