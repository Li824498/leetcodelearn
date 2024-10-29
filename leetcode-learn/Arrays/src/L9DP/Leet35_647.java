package L9DP;

public class Leet35_647 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int countSubstrings(String s) {
            boolean[][] dp = new boolean[s.length()][s.length()];
            int result = 0;

            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < s.length(); j++){
                    dp[i][j] = false;
                }
            }

            for(int i = s.length() - 1; i >= 0; i--){
                for(int j = i; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        if(j - i <= 1){
                            dp[i][j] = true;
                            result++;
                        }else if(dp[i + 1][j - 1]){
                            dp[i][j] = dp[i+1][j-1];
                            result++;
                        }
                    }else{
                        dp[i][j] = false;
                    }
                }
            }

            return result;
        }
    }
}
