package L9DP;

import java.util.Arrays;

public class Leet27_674 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int[] dp = new int[nums.length];

            Arrays.fill(dp, 1);

            int result = 1;

            for(int i = 1; i < nums.length; i++){
                if(nums[i] > nums[i-1]){
                    dp[i] = dp[i-1] + 1;
                }

                result = Math.max(dp[i], result);
            }

            return result;
        }
    }
}
