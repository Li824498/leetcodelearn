package L1Array;

public class leet1_704 {
    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};

        Solution solution = new Solution();
        System.out.println(solution.search(nums,13));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (nums[middle] > target) {
                    right = middle - 1;
                } else if (nums[middle] < target ) {
                    left = middle + 1;
                } else {
                    return middle;
                }
            }
            return -1;

        }
    }
}

