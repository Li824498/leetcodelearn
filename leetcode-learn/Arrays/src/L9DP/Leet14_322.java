package L9DP;

public class Leet14_322 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int coinChange(int[] coins, int amount) {
            int max = Integer.MAX_VALUE;
            int[] dp = new int[amount + 1];
            for(int i = 0; i <= amount; i++){
                dp[i] = max;
            }
            dp[0] = 0;

            for(int i = 0; i < coins.length; i++){
                for(int j = coins[i]; j <= amount; j++){
                    if(dp[j - coins[i]] != max){
                        dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                    }

                }
            }

            return dp[amount] == max ? -1 : dp[amount];

        }
    }
}
