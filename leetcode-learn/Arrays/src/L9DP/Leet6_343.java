package L9DP;

public class Leet6_343 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int integerBreak(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for(int i = 3; i <= n; i++){
                for(int j = 1; j < i; j++){
                    dp[i] = Math.max(j*(i-j), Math.max(j*dp[i-j], dp[i]));
                }
            }
            return dp[n];

        }
    }
}
