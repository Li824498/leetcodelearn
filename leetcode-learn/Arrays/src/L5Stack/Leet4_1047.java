package L5Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet4_1047 {
    public static void main(String[] args) {

    }

    static class Solution {
        public String removeDuplicates(String s) {
            Deque<Character> deque = new ArrayDeque<>();

            int size = s.length();

            for(int i = 0; i < size; i++){
                char ch = s.charAt(i);
                if(deque.isEmpty() || ch != deque.peek()){
                    deque.push(ch);
                } else if (ch == deque.peek())
                    deque.pop();
            }


            String str = "";
            while(!deque.isEmpty()){
                str = deque.pop() + str;
            }
            return str;


        }

    }

}
