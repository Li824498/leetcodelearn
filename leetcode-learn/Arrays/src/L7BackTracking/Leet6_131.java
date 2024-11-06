package L7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet6_131 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<String> path = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        public List<List<String>> partition(String s) {
            backtracking(s ,0, new StringBuilder());
            return res;
        }

        public void backtracking(String s, int start, StringBuilder sb) {
            if (start == s.length()){
                res.add(new ArrayList<>(path));
                return;
            }

            for(int i = start; i < s.length(); i++) {
                sb.append(s.charAt(i));
                if(check(sb)) {
                    path.add(sb.toString());
                    backtracking(s, i + 1, new StringBuilder());
                    path.remove(path.size() - 1);
                }
            }
        }

        public boolean check(StringBuilder sb) {
            for(int i = 0; i < sb.length() / 2; i++){
                if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
                    return false;
                }
            }

            return true;
        }
    }
}
