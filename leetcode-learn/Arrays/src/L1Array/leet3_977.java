package L1Array;

import java.util.Arrays;

public class leet3_977 {
    /**
     * 有序数组的平方
     * way1：暴力解法
     * way2：双指针
     */
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution2.sortedSquares(new int[]{-4,-1,0,3,10})));

    }
    static class Solution {
        public int[] sortedSquares(int[] nums) {
            for(int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
            for (int i = 0; i < nums.length; i++){
                for(int j = i; j < nums.length; j++){
                    if (nums[j] < nums[i]) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
            return nums;

        }
    }

    static class Solution2 {
        public int[] sortedSquares(int[] nums) {
            int k = nums.length - 1;
            int[] arr = new int[nums.length];
            int i = 0;
            int j = k;

            for(; i<= j; ){
                int i2 = nums[i] * nums[i];
                int j2 = nums[j] * nums[j];
                if (i2 > j2) {
                    arr[k--] = i2;
                    i++;
                } else {
                    arr[k--] = j2;
                    j--;
                }
            }
            return arr;

        }
    }
}


