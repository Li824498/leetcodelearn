package L6Tree;

public class Leet9_111 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int minDepth(TreeNode root) {
            return getheight(root);
        }

        public int getheight(TreeNode root){
            if(root == null){
                return 0;
            }

            int leftheight = getheight(root.left);
            int rightheight = getheight(root.right);

            if(root.left == null && root.right != null){
                return rightheight + 1;
            }else if(root.left != null && root.right == null){
                return leftheight + 1;
            }else{
                return Math.min(leftheight, rightheight) + 1;
            }
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
