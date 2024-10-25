package L9DP;

public class Leet18_213 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int rob(int[] nums) {
            int length = nums.length;
            if(length == 1) return nums[0];
            if(length == 2) return Math.max(nums[0], nums[1]);

            return Math.max(robAction(nums, 0, length-1), robAction(nums, 1, length-1));
        }

        public int robAction(int[] nums, int start, int length){
            int[] dp = new int[length];


            dp[0] = nums[start];
            dp[1] = Math.max(dp[0], nums[start + 1]);

            for(int i = 2; i < length; i++){
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[start + i]);
            }

            return dp[length - 1];
        }
    }
}
