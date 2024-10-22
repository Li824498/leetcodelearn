package L9DP;

public class Leet10_474 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][] dp = new int[m+1][n+1];
            dp[0][0] = 0;
            for(String str:strs){
                int x = 0;
                int y = 0;
                for(char ch:str.toCharArray()){
                    if(ch == '0'){
                        x++;
                    }else{
                        y++;
                    }
                }
                for(int i = m; i >= x; i--){
                    for(int j = n; j>=y; j--){
                        dp[i][j] = Math.max(dp[i][j], dp[i-x][j-y] + 1);
                    }
                }


            }
            return dp[m][n];
        }
    }
}
