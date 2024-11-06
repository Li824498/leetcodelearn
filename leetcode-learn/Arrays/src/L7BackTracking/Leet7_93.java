package L7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet7_93 {
    public static void main(String[] args) {

    }
    static class Solution {
        List<String> result = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            if(s.length() > 12) return result;
            backTrack(s, 0, 0);
            return result;
        }

        public void backTrack(String s, int startIndex, int pointNum) {
            if(pointNum == 3) {
                if(isVaild(s, startIndex, s.length() - 1)) {
                    result.add(s);
                }
                return;
            }

            for(int i = startIndex; i < s.length(); i++){
                if(isVaild(s, startIndex, i)) {
                    s = s.substring(0, i+1) + "." + s.substring(i+1);
                    pointNum++;
                    backTrack(s, i + 2, pointNum);
                    pointNum--;
                    s = s.substring(0, i+1) + s.substring(i+2);
                } else {
                    break;
                }
            }
        }

        public boolean isVaild(String s, int start, int end) {
            if(start > end) {
                return false;
            }

            if(s.charAt(start) == '0' && start != end) {
                return false;
            }

            int num = 0;
            for(int i = start; i <= end; i++){
                if(s.charAt(i) > '9' || s.charAt(i) < '0'){
                    return false;
                }
                num = num * 10 + (s.charAt(i) - '0');
                if(num >255) {
                    return false;

                }
            }

            return true;
        }
    }
}
