package L8Greedy;

import java.util.Arrays;

public class Leet1_455 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int start = s.length - 1;
            int count = 0;

            for(int i = g.length - 1; i >= 0; i--) {
                if(start >= 0 && g[i] <= s[start]){
                    start--;
                    count++;
                }
            }

            return count;

        }
    }
}
