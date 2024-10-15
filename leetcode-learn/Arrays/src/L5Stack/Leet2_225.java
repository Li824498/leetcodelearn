package L5Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Leet2_225 {
    public static void main(String[] args) {

    }
    static class MyStack {
        Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();

        }

        public void push(int x) {
            queue.add(x);

        }

        public int pop() {
            rePosition();
            return queue.poll();
        }

        public int top() {
            rePosition();
            int result = queue.poll();
            queue.add(result);
            return result;
        }

        public boolean empty() {
            return queue.isEmpty();
        }

        public void rePosition(){
            int size = queue.size();
            size--;
            while(size != 0){
                queue.add(queue.poll());
                size--;
            }

        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
