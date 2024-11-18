package L10_Stack2;

import java.util.*;

public class Leet2_496 {
    public static void main(String[] args) {

    }
    static class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ;i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 1; i < nums2.length; i++) {
            if(nums2[i] < nums2[stack.peek()]) {
                stack.push(i);
            }else{
                while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                    if(map.containsKey(nums2[stack.peek()])){
                        res[map.get(nums2[stack.peek()])] = nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
}
