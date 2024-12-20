package L9DP;

public class Leet7_96 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int numTrees(int n) {
            if(n < 2) return 1;
            int[] dp = new int[n+1];
            dp[0] = 1;
            dp[1] = 1;

            for(int i = 2; i <= n; i++){
                for(int j = 0; j <= i-1; j++){
                    dp[i] += dp[j] * dp[i-1 - j];
                }
            }
            return dp[n];

        }
    }

}
