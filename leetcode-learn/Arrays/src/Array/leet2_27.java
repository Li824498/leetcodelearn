package Array;

import java.util.Arrays;

/**
 * 移除元素
 */
public class leet2_27 {
    public static void main(String[] args) {
//        Solution1 solution = new Solution1();
        Solution2 solution = new Solution2();
        System.out.println(solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));

    }

    static class Solution1 {
        public int removeElement(int[] nums, int val) {
            int temp = 0;
            for (int i = 0; i < nums.length - temp; ){
                if (nums[i] == val) {
                    for(int j = i; j < nums.length - temp -1; j++) {
                        nums[j] = nums[j+1];
                    }
                    temp++;
                } else if (nums[i] != val){
                    i++;
                }
            }
            System.out.println(Arrays.toString(nums));
            return nums.length - temp;
        }
    }

    static class Solution2 {
        public int removeElement(int[] nums, int val) {
            int slow = 0;
            for(int fast = 0; fast < nums.length; fast++) {
                if(nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow++;
                }
            }
            System.out.println(Arrays.toString(nums));
            return slow;
        }
    }
}
