package L8Greedy;

public class Leet4_122 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int result = 0;
            for(int i = 1; i < prices.length; i++){
                result += Math.max(prices[i] - prices[i-1], 0);
            }
            return result;

        }
    }
}
