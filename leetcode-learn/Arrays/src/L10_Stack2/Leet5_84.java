package L10_Stack2;

import java.util.Deque;
import java.util.LinkedList;

public class Leet5_84 {
    public static void main(String[] args) {

    }
    static class Solution {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length - 1] = 0;
        for(int i = 0; i < heights.length; i++) {
            newHeights[i + 1] = heights[i];
        }

        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 1; i < newHeights.length; i++) {
            if(newHeights[i] > newHeights[stack.peek()]) {
                stack.push(i);
            }else if(newHeights[i] == newHeights[stack.peek()]) {
                stack.pop();
                stack.push(i);
            }else{
                while(!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                    int middleIndex = stack.pop();
                    int rightIndex = i;
                    int leftIndex = stack.peek();
                    int h = newHeights[middleIndex];
                    int w = rightIndex - leftIndex - 1;
                    result = Math.max(result, h*w);

                }
                stack.push(i);
            }
        }
        return result;
    }
}
}
