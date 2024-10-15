package L5Stack;

import java.util.Stack;

public class Leet1_232 {
    public static void main(String[] args) {

    }

    static class MyQueue {
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;

        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();

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
            return stackOut.peek();

        }

        public boolean empty() {
            return stackIn.isEmpty()&&stackOut.isEmpty();

        }

        public void dumpStackIn(){
            if(!stackOut.isEmpty()) return;
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
}
