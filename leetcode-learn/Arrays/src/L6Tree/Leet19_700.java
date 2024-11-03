package L6Tree;

public class Leet19_700 {
    public static void main(String[] args) {

    }
    static class Solution1 {
        public TreeNode searchBST(TreeNode root, int val) {
            return traversal(root, val);

        }

        public TreeNode traversal(TreeNode root, int val) {
            if(root == null || root.val == val) return root;

            TreeNode result = null;
            if(val < root.val){
                result = traversal(root.left, val);
            }else if(val > root.val){
                result = traversal(root.right, val);
            }
            return result;
        }
    }

    static class Solution2 {
        public TreeNode searchBST(TreeNode root, int val) {
            while(root != null){
                if(val < root.val) {
                    root = root.left;
                } else if(val > root.val) {
                    root = root.right;
                } else{
                    return root;
                }

            }
            return null;

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
