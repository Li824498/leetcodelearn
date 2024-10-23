package L9DP;

public class Leet10_494 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0;
            for(int num:nums){
                sum += num;
            }
            int bagSize = (sum + target) / 2;

            if((sum + target) % 2 == 1) return 0;
            if(Math.abs(target) > sum) return 0;


            int[] dp = new int[bagSize + 1];
            dp[0] = 1;


            for(int i = 0; i < nums.length; i++){
                for(int j = bagSize; j >= nums[i]; j--){
                    dp[j] += dp[j - nums[i]];
                }
            }

            return dp[bagSize];
        }
    }
}
