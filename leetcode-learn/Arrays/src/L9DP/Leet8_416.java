package L9DP;

public class Leet8_416 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean canPartition(int[] nums) {
            if(nums == null || nums.length == 0) return false;
            int sum = 0;
            for(int num:nums){
                sum += num;
            }
            if(sum % 2 == 1){
                return false;
            }
            int target = sum / 2;
            int[] dp = new int[target + 1];
            for(int i = 0; i < nums.length; i++){
                for(int j = target; j >= nums[i]; j--){
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);

                    if(dp[j] == target){
                        return true;
                    }
                }
            }

            return dp[target] == target;


        }
    }
}
