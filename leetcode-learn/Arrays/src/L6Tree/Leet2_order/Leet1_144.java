package L6Tree.Leet2_order;

import L6Tree.Leet1_order.Leet2_145;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leet1_144 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();

            if(root == null){
                return result;
            }

            Deque<TreeNode> deque = new LinkedList<>();
            deque.push(root);

            while(!deque.isEmpty()){
                TreeNode node = deque.pop();
                result.add(node.val);
                if(node.right != null){
                    deque.push(node.right);
                }
                if(node.left != null){
                    deque.push(node.left);
                }
            }

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
