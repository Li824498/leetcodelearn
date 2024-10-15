package L5Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Leet6_239 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            MyQueue myQueue = new MyQueue();

            int len = nums.length - k + 1;

            int[] res = new int[len];

            for(int i = 0; i < k; i++){
                myQueue.add(nums[i]);
            }
            res[0] = myQueue.peek();
            for(int i = k; i < nums.length; i++){
                myQueue.poll(nums[i - k]);
                myQueue.add(nums[i]);

                res[i - k + 1] = myQueue.peek();
            }

            return res;

        }
        class MyQueue {
            Deque<Integer> deque = new LinkedList<>();

            public void poll(int val){
                if(!deque.isEmpty() && deque.peek() == val){
                    deque.poll();
                }
            }

            public void add(int val){
                while(!deque.isEmpty()&&val > deque.getLast()){
                    deque.removeLast();
                }
                deque.add(val);
            }

            public int peek(){
                return deque.peek();
            }
        }
    }
}
