package L7BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet12_47 {
    public static void main(String[] args) {

    }

    static class Solution {
        private List<Integer> path;
        private List<List<Integer>> result;
        private int[] used;
        public List<List<Integer>> permuteUnique(int[] nums) {
            path = new ArrayList<>();
            result = new ArrayList<>();
            Arrays.sort(nums);
            used = new int[nums.length];
            backtracking(nums);
            return result;
        }

        public void backtracking(int[] nums) {
            if(path.size() == nums.length) {
                result.add(new ArrayList<>(path));
                return;
            }


            for(int i = 0; i < nums.length; i++) {
                if(i > 0 && nums[i-1] == nums[i] && used[i-1] == 0) {
                    continue;
                }

                if(used[i] == 0) {
                    used[i] = 1;
                    path.add(nums[i]);
                    backtracking(nums);
                    path.remove(path.size() - 1);
                    used[i] = 0;
                }
            }
        }
    }
}
