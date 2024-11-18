package L10_Stack2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Leet3_503 {
    public static void main(String[] args) {

    }
    static class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 1; i < nums.length * 2; i++) {
            int index = i % nums.length;
            if(nums[index] <= nums[stack.peek()]) {
                stack.push(index);
            } else {
                while(!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                    res[stack.peek()] = nums[index];
                    stack.pop();
                }
                stack.push(index);
            }
        }
        return res;
    }
}
}
