package L8Greedy;

public class Leet9_135 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int candy(int[] ratings) {
            int len = ratings.length;
            int[] candyVec = new int[len];

            candyVec[0] = 1;
            for(int i = 1; i < len; i++) {
                candyVec[i] = (ratings[i] > ratings[i-1]) ? candyVec[i - 1] + 1 : 1;
            }

            for(int i = len - 2; i >= 0; i--) {
                if(ratings[i] > ratings[i + 1]) {
                    candyVec[i] = Math.max(candyVec[i + 1] + 1, candyVec[i]);
                }
            }

            int ans = 0;
            for(int num : candyVec) {
                ans += num;
            }
            return ans;
        }
    }
}
