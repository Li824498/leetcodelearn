package L5Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Leet3_20 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean isValid(String s) {
            Deque<Character> deque = new LinkedList<>();
            int size = s.length();

            for(int i = 0; i < size; i++){
                char ch = s.charAt(i);
                if(ch == '('){
                    deque.push(')');
                }else if(ch == '{'){
                    deque.push('}');
                }else if(ch == '['){
                    deque.push(']');
                }else if(deque.isEmpty() || deque.peek() != ch){
                    return false;
                }else{
                    deque.pop();
                }
            }

            return deque.isEmpty();

        }
    }
}
