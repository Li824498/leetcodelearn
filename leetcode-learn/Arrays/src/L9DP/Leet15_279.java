package L9DP;

public class Leet15_279 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int numSquares(int n) {
            int max = Integer.MAX_VALUE;

            int[] dp = new int[n + 1];
            for(int i = 0; i <= n; i++){
                dp[i] = max;
            }
            dp[0] = 0;

            for(int i = 1; i*i <= n; i++){
                for(int j = i*i; j <= n; j++){
                    // if(dp[j - i*i] != max){
                    dp[j] = Math.min(dp[j - i*i] + 1, dp[j]);
                    // }
                }
            }
            return dp[n];

        }
    }
}
