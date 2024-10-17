package L6Tree.Leet2_order;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leet3_94 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if(root == null){
                return result;
            }

            Deque<TreeNode> deque = new LinkedList<>();
            TreeNode cur = root;

            while(cur != null || !deque.isEmpty()){
                if(cur != null){
                    deque.push(cur);
                    cur = cur.left;
                }else{
                    cur = deque.pop();
                    result.add(cur.val);
                    cur = cur.right;
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
