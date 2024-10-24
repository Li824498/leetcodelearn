package L9DP;

import java.util.List;

public class Leet16_139 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;

            for(int j = 0; j <= s.length(); j++){
                for(int i = 0; i < wordDict.size(); i++){
                    String word = wordDict.get(i);
                    int len = word.length();
                    if((j-len>=0)&&word.equals(s.substring(j - len, j))&&dp[j - len] == true){
                        dp[j] = true;
                    }
                }
            }

            return dp[s.length()];

        }
    }
}
