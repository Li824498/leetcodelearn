package L7BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet9_90 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<List<Integer>> res;
        List<Integer> path;
        boolean[] used;
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            res = new ArrayList<>();
            path = new ArrayList<>();
            used = new boolean[nums.length];


            Arrays.sort(nums);

            backtracking(nums, 0);
            return res;
        }

        public void backtracking(int[] nums, int startIndex) {
            res.add(new ArrayList<>(path));

            for(int i = startIndex; i < nums.length; i++) {
                if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                    continue;
                }

                path.add(nums[i]);
                used[i] = true;
                backtracking(nums, i+1);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
