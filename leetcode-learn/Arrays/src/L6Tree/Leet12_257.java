package L6Tree;

import java.util.ArrayList;
import java.util.List;

public class Leet12_257 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            if(root == null){
                return res;
            }
            List<Integer> paths = new ArrayList<>();
            traversal(root, res, paths);
            return res;
        }

        public void traversal(TreeNode root, List<String> res, List<Integer> paths){
            paths.add(root.val);

            if(root.left == null && root.right == null){
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < paths.size() - 1; i++){
                    sb.append(paths.get(i)).append("->");
                }
                sb.append(paths.get(paths.size() - 1));
                res.add(sb.toString());
                return;
            }

            if(root.left != null){
                traversal(root.left, res, paths);
                paths.remove(paths.size() - 1);
            }
            if(root.right != null){
                traversal(root.right, res, paths);
                paths.remove(paths.size() - 1);
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
}
