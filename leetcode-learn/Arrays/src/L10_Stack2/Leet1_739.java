package L10_Stack2;

import java.util.Deque;
import java.util.LinkedList;

public class Leet1_739 {
    public static void main(String[] args) {

    }
    static class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 1; i < length; i++) {
            if(temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            }else{
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
}
