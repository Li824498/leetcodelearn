package L4String;

public class Leet4_28 {
    public static void main(String[] args) {

    }

    static class Solution1 {
        public int strStr(String haystack, String needle) {
            for(int start = 0; start + needle.length() <= haystack.length(); start++){
                int flag = 0;
                for(int delta = 0; delta < needle.length(); delta++){
                    if(haystack.charAt(start + delta) != needle.charAt(delta)){
                        flag = -1;
                        break;
                    }
                }
                if(flag == 0){
                    return start;
                }
            }
            return -1;

        }
    }

    static class Solution {
        public int strStr(String ss, String pp) {
            int n = ss.length(), m = pp.length();
            char[] s = ss.toCharArray(), p = pp.toCharArray();
            // 枚举原串的「发起点」
            for (int i = 0; i <= n - m; i++) {
                // 从原串的「发起点」和匹配串的「首位」开始，尝试匹配
                int a = i, b = 0;
                while (b < m && s[a] == p[b]) {
                    a++;
                    b++;
                }
                // 如果能够完全匹配，返回原串的「发起点」下标
                if (b == m) return i;
            }
            return -1;
        }
    }

}
