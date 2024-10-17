package L6Tree.Leet1_order;

import java.util.ArrayList;
import java.util.List;

public class Leet2_145 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            postorder(root, result);
            return result;

        }

        public void postorder(TreeNode root, List<Integer> result){
            if(root == null){
                return;
            }

            postorder(root.left, result);
            postorder(root.right, result);
            result.add(root.val);
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
