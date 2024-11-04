package L6Tree;

import java.util.ArrayList;
import java.util.List;

public class Leet22_501 {
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
        List<Integer> resList;
        TreeNode pre;
        int maxCount;
        int count;

        public int[] findMode(TreeNode root) {
            resList = new ArrayList<>();
            findMode1(root);
            int[] res = new int[resList.size()];
            for(int i = 0; i < resList.size(); i++){
                res[i] = resList.get(i);
            }
            return res;
        }

        public void findMode1(TreeNode cur) {
            if(cur == null) return;

            findMode1(cur.left);
            if(pre == null) {
                count = 1;
            }else if(cur.val == pre.val) {
                count++;
            }else {
                count = 1;
            }

            if(count > maxCount){
                resList.clear();
                resList.add(cur.val);
                maxCount = count;
            }else if(count == maxCount){
                resList.add(cur.val);
            }
            pre = cur;

            findMode1(cur.right);
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
