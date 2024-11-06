package L6Tree;

public class Leet28_108 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sATBST(nums, 0, nums.length - 1);
        }

        public TreeNode sATBST(int[] nums, int left, int right) {
            if(left > right) return null;

            int middle = (left + right) / 2;
            TreeNode root = new TreeNode(nums[middle]);

            root.left = sATBST(nums, left, middle - 1);
            root.right = sATBST(nums, middle + 1, right);

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
