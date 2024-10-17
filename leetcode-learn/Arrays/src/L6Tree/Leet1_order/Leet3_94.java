package L6Tree.Leet1_order;

import java.util.ArrayList;
import java.util.List;

public class Leet3_94 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorder(root, result);
            return result;
        }

        public void inorder(TreeNode root, List<Integer> result){
            if(root == null){
                return;
            }

            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
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
