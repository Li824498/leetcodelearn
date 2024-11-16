package L8Greedy;

public class Leet16_738 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int monotoneIncreasingDigits(int n) {
            String s = String.valueOf(n);
            char[] chars = s.toCharArray();
            int flag = chars.length;
            for(int i = chars.length - 2; i >= 0; i--) {
                if(chars[i] > chars[i + 1]) {
                    chars[i]--;
                    flag = i + 1;
                }
            }
            for(int i = flag; i < chars.length; i++) {
                chars[i] = '9';
            }
            return Integer.parseInt(String.valueOf(chars));
        }
    }
}
