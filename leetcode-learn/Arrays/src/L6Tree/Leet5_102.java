package L6Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet5_102 {
    public static void main(String[] args) {

    }

    static /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            checkFun(root, result);

            return result;

        }

        public void checkFun(TreeNode root, List<List<Integer>> result){
            if (root == null) return;
            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root);

            while(!queue.isEmpty()){
                List<Integer> list = new ArrayList<>();

                int len = queue.size();

                while(len != 0){
                    TreeNode node = queue.poll();

                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }

                    list.add(node.val);
                    len--;
                }

                result.add(list);
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
