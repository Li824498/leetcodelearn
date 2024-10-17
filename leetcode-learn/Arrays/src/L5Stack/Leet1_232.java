package L5Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leet1_232 {
    public static void main(String[] args) {

    }

    static class MyQueue {
        Deque<Integer> stackIn;
        Deque<Integer> stackOut;

    public MyQueue() {
            stackIn = new LinkedList<>();
            stackOut = new LinkedList<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            dumpStackIn();
            return stackOut.pop();
        }

        public int peek() {
            dumpStackIn();
            int result = stackOut.pop();
            stackOut.push(result);
            return result;
        }

        public boolean empty() {
            return stackIn.isEmpty() && stackOut.isEmpty();
        }

        public void dumpStackIn(){
            if(!stackOut.isEmpty()) return;
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }

        }
    }
}
