package L4String;

public class Leet3_151 {
    public static void main(String[] args) {

    }

//    static class Solution1 {
//        public String reverseWords(String s) {
//            char[] ch = s.toCharArray();
//
//            for(int fast = 0; fast < s.length(); fast++){
//                if(ch[fast] != ' ') {
//                    if(slow != 0) {
//                        ch[slow] = ' ';
//                        slow++;
//                    }
//                    while(fast < s.length() && ch[fast] != ' '){
//                        ch[slow] = ch[fast];
//                        slow++;
//                        fast++;
//                    }
//                }
//            }
//
//            for(int slow = 0; slow < s.length() / 2; slow++) {
//                char temp = ch[slow];
//                ch[slow] = ch[fast];
//                ch[fast] = temp;
//                fast--;
//            }
//
//            return new String(ch);
//
//        }
//    }

    static class Solution2 {
        public String reverseWords(String s) {
            char[] ch = s.toCharArray();

            int slow = 0;
            for(int fast = 0; fast < s.length(); fast++){
                if(slow != 0 && ch[slow-1] != ' ' && fast != s.length() - 1){
                    ch[slow] = ' ';
                    slow++;
                }
                while(fast < s.length() && ch[fast] != ' '){
                    ch[slow] = ch[fast];
                    slow++;
                    fast++;
                }
            }

            char[] resch = new char[slow];
            System.arraycopy(ch, 0, resch, 0, slow);

            reverse(resch, 0, resch.length - 1);

            // return new String(resch);

            slow = 0;
            for(int fast = 0; fast <= resch.length; fast++){
                if(fast == resch.length||ch[fast] == ' '){
                    reverse(resch, slow, fast - 1);

                    slow = fast + 1;
                }
            }

            return new String(resch);




        }

        public char[] reverse(char[] ch, int start, int end){
            while(start < end){
                char temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;

                start++;
                end--;
            }
            return ch;
        }
    }
}

