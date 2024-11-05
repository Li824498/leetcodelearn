package L6Tree;

public class Leet26_450 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root == null) return null;
            if(root.val == key){
                if(root.left != null && root.right == null) {
                    return root.left;
                }else if(root.left == null && root.right != null) {
                    return root.right;
                }else if(root.left == null && root.right == null) {
                    return null;
                }else{
                    TreeNode cur = root.right;
                    while(cur.left != null){
                        cur = cur.left;
                    }
                    cur.left = root.left;
                    return root.right;
                }
            }

            if(key < root.val) {
                root.left = deleteNode(root.left, key);
            }else if(key > root.val) {
                root.right = deleteNode(root.right, key);
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
