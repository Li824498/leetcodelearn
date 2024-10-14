package L4String;

public class Leet5_459 {
    public static void main(String[] args) {


    }


    static class Solution1 {
        public boolean repeatedSubstringPattern(String s) {
            boolean match = false;
            for(int j = 1; j <= s.length()/2 ; j++){
                if(s.length() % j == 0){
                    match = true;
                    for(int i = j; i < s.length(); i++){
                        if(s.charAt(i) != s.charAt(i - j)){
                            match = false;
                            break;
                        }
                    }
                    if(match){
                        return match;
                    }
                }
            }
            return false;

        }
    }

    static class Solution2 {
        public boolean repeatedSubstringPattern(String s) {
            String t = s + s;

            t = t.substring(1, t.length() - 1);

            if(t.contains(s)){
                return true;
            } else {
                return false;
            }

        }
    }
}
