package L3HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet5_15 {
    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * way: 排序+双指针
     * @param args
     */
    public static void main(String[] args) {

    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > 0){
                    return result;
                }
                if(i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i+1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum > 0){
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while((left<right)&&(nums[left] == nums[left+1])) {
                            left++;
                        }
                        while((left<right)&&(nums[right] == nums[right-1])) {
                            right--;
                        }

                        left++;
                        right--;
                    }
                }

            }

            return result;

        }
    }
}
