package L10_Stack2;

import java.util.Deque;
import java.util.LinkedList;

public class Leet4_42 {
    public static void main(String[] args) {

    }
    static class Solution {
    public int trap(int[] height) {
        int sum = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 1; i < height.length; i++) {
            if(height[i] < height[stack.peek()]) {
                stack.push(i);
            } else if(height[i] == height[stack.peek()]) {
                stack.pop();
                stack.push(i);
            } else {
                while(!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int midlleIndex = stack.pop();
                    if(!stack.isEmpty()) {
                        int leftIndex = stack.peek();
                        int h = Math.min(height[leftIndex], height[i]) - height[midlleIndex];
                        int w = i - leftIndex - 1;
                        sum += h * w;
                    }
                }
                stack.push(i);
            }
        }
        return sum;
    }
}
}
