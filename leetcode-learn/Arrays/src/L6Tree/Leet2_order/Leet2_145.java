package L6Tree.Leet2_order;

import java.util.*;

public class Leet2_145 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();

            if(root == null){
                return result;
            }

            Deque<TreeNode> deque = new LinkedList<>();
            deque.push(root);
            while(!deque.isEmpty()){
                TreeNode node = deque.pop();
                result.add(node.val);
                if(node.left != null){
                    deque.push(node.left);
                }
                if(node.right != null){
                    deque.push(node.right);
                }

            }

            Collections.reverse(result);

            return result;
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
