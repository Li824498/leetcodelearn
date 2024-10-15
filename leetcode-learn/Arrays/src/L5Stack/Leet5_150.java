package L5Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Leet5_150 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int evalRPN(String[] tokens) {
            Deque<Integer> deque = new LinkedList<>();
            int size = tokens.length;

            for(int i = 0; i < size; i++){
                String s = tokens[i];
                if("+".equals(s)){
                    deque.push(deque.pop() + deque.pop());
                } else if ("-".equals(s)) {
                    deque.push(-deque.pop() + deque.pop());
                } else if ("*".equals(s)) {
                    deque.push(deque.pop() * deque.pop());
                } else if ("/".equals(s)) {
                    int temp1 = deque.pop();
                    int temp2 = deque.pop();
                    deque.push(temp2 / temp1);
                } else {
                    deque.push(Integer.valueOf(s));
                }
            }
            return deque.pop();

        }
    }
}
