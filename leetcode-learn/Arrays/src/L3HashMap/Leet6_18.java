package L3HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet6_18 {
    public static void main(String[] args) {

    }
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();

            for(int k = 0; k < nums.length; k++) {
                if (nums[k] > target && nums[k] > 0 && target > 0){
                    break;
                }
                if (k > 0 && nums[k] == nums[k-1]) {
                    continue;
                }
                for(int i = k + 1; i < nums.length; i++){
                    if (nums[i]+nums[k] > target && nums[i] > 0 && target > 0){
                        break;
                    }
                    if (i > k + 1 && nums[i] == nums[i-1]) {
                        continue;
                    }
                    int left = i + 1;
                    int right = nums.length - 1;
                    while(left < right) {
                        long sum = (long) nums[k] + nums[i] + nums[left] + nums[right];

                        if(sum > target) {
                            right--;
                        } else if(sum < target) {
                            left++;
                        } else {
                            result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                            while (right>left&&nums[left] == nums[left+1]) left++;
                            while (right>left&&nums[right] == nums[right-1]) right--;
                            left++;
                            right--;
                        }
                    }
                }
            }

            return result;

        }
    }
}
