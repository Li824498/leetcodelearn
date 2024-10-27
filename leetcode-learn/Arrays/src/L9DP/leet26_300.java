package L9DP;

import java.util.Arrays;

public class leet26_300 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];

            Arrays.fill(dp, 1);
            int result = 1;

            for(int i = 1; i < nums.length; i++){
                for(int j = 0; j < i; j++){
                    if(nums[i] > nums[j]){
                        dp[i] = Math.max(dp[j] + 1, dp[i]);

                    }
                }
                result = Math.max(dp[i], result);
            }

            return result;
        }
    }
}
