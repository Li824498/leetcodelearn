package L6Tree.Leet1_order;


import java.util.ArrayList;
import java.util.List;

public class Leet1_144 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root, result);
            return result;

        }

        public void preorder(TreeNode root, List<Integer> result){
            if(root == null){
                return;
            }

            result.add(root.val);
            preorder(root.left, result);
            preorder(root.right, result);
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
