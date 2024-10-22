package L9DP;

public class Leet9_1049 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int lastStoneWeightII(int[] stones) {
            int[] dp = new int[1501];
            int sum = 0;
            for(int i:stones){
                sum += i;
            }
            int target = sum / 2;
            for(int i = 0; i < stones.length; i++){
                for(int j = target; j >= stones[i]; j--){
                    dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
                }
            }
            return sum - 2 * dp[target];

        }
    }
}
