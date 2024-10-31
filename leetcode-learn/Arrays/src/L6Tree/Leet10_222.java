package L6Tree;

public class Leet10_222 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int countNodes(TreeNode root) {
            if(root == null){
                return 0;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            int leftheight = 0;
            int rightheight = 0;
            while(left != null){
                left = left.left;
                leftheight++;
            }
            while(right != null){
                right = right.right;
                rightheight++;
            }
            if(leftheight == rightheight){
                return (2 << leftheight) - 1;
            }

            int leftNumber = countNodes(root.left);
            int rightNumber = countNodes(root.right);
            return leftNumber + rightNumber + 1;
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
