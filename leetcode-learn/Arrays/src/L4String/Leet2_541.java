package L4String;

public class Leet2_541 {
    public static void main(String[] args) {

    }

    static class Solution {
        public String reverseStr(String s, int k) {
            char[] ch = s.toCharArray();
            for(int i = 0; i < s.length(); i += 2 * k) {
                int start = i;
                int end = Math.min(i + k - 1, s.length() - 1);
                while(start < end){
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;

                    start++;
                    end--;
                }
            }

            return new String(ch);

        }
    }
}
