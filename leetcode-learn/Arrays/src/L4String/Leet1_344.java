package L4String;

public class Leet1_344 {
    public static void main(String[] args) {

    }

    static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while(left < s.length / 2) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left++;
                right--;
            }

        }
    }
}
