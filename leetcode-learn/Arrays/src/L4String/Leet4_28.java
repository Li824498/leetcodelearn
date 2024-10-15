package L4String;

public class Leet4_28 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.strStr("hello", "ll"));

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

    static class Solution3 {
        public int strStr(String ss, String pp) {
            if(pp.isEmpty()) return 0;

            int ls = ss.length();
            int lp = pp.length();

            char[] cs = ss.toCharArray();
            char[] ps = pp.toCharArray();

            int[] next = new int[lp];
            next[0] = 0;

            for(int j = 0,i = 1; i < lp; i++){
                while(j>0&&ps[j] != ps[i]) j = next[j - 1];
                if(ps[j] == ps[i]) j++;
                next[i] = j;
            }



            for(int j = 0, i = 0; i < ls; i++){
                while(j > 0&&ps[j] != cs[i]) j = next[j-1];
                if(ps[j] == cs[i]) j++;
                if(j == lp) return i - j + 1;
            }
            return -1;


        }
    }

    static class Solution4 {
        public int strStr(String ss, String pp) {
            if(pp.isEmpty()){
                return 0;
            }

            char[] cp = pp.toCharArray();
            char[] cs = ss.toCharArray();

            int lp = cp.length;
            int ls = cp.length;

            int[] next = new int[lp];
            next[0] = 0;
            for(int j = 0,i = 1; i < lp; i++){
                while(j>0 && cp[j] != cp[i]) j = next[j - 1];
                if(cp[j] == cp[i]) j++;
                next[i] = j;
            }

            for (int i : next) {
                System.out.println(i);
            }

            for(int j = 0,i = 0; i < ls; i++){
                while(j>0 && cp[j] != cs[i]) j = next[j - 1];
                if(cp[j] == cs[i]) j++;
                if(j == lp){
                    return i - j + 1;
                }
            }
            return -1;

        }
    }

}
