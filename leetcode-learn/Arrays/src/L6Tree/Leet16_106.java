package L6Tree;

import java.util.HashMap;
import java.util.Map;

public class Leet16_106 {
    public static void main(String[] args) {

    }

    static class Solution {
        Map<Integer, Integer> map;
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            map = new HashMap<>();
            for(int i = 0; i < inorder.length; i++){
                map.put(inorder[i], i);
            }
            return buildHelper(inorder, 0, inorder.length, postorder, 0, postorder.length);
        }

        public TreeNode buildHelper(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd){
            if(inBegin >= inEnd || postBegin >= postEnd) return null;

            int rootIndex = map.get(postorder[postEnd - 1]);
            TreeNode root = new TreeNode(inorder[rootIndex]);
            int lenOfLeft = rootIndex - inBegin;
            root.left = buildHelper(inorder, inBegin, rootIndex, postorder, postBegin, postBegin + lenOfLeft);
            root.right = buildHelper(inorder, rootIndex + 1, inEnd, postorder, postBegin + lenOfLeft, postEnd - 1);
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
