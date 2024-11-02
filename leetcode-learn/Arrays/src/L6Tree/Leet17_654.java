package L6Tree;

public class Leet17_654 {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return construct(nums, 0, nums.length);
        }

        public TreeNode construct(int[] nums, int leftIndex, int rightIndex){
            if(leftIndex == rightIndex) return null;
            if(rightIndex == leftIndex + 1) return new TreeNode(nums[leftIndex]);

            int maxIndex = leftIndex;
            int maxValue = nums[maxIndex];
            for(int i = leftIndex; i < rightIndex; i++){
                if(nums[i] > maxValue){
                    maxValue = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode(maxValue);
            root.left = construct(nums, leftIndex, maxIndex);
            root.right = construct(nums, maxIndex+1, rightIndex);
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
