package L9DP;

public class Leet13_377 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int length = nums.length;
            int[] dp = new int[target + 1];
            dp[0] = 1;

            for(int j = 0; j <= target; j++){
                for(int i = 0; i < length; i++){
                    if(j - nums[i] >= 0){
                        dp[j] += dp[j -nums[i]];
                    }
                }
            }

            return dp[target];

        }
    }
}
