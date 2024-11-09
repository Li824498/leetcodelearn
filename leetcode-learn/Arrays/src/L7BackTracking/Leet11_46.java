package L7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet11_46 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<Integer> path;
        List<List<Integer>> res;
        boolean[] used;
        public List<List<Integer>> permute(int[] nums) {
            path = new ArrayList<>();
            res = new ArrayList<>();
            used = new boolean[nums.length];
            backtracking(nums);
            return res;
        }

        public void backtracking(int[] nums) {
            if(path.size() == nums.length) {
                res.add(new ArrayList<>(path));
            }

            for(int i = 0; i < nums.length; i++) {
                if(used[i]) {
                    continue;
                }
                used[i] = true;
                path.add(nums[i]);
                backtracking(nums);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
