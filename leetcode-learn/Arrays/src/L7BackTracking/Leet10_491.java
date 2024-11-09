package L7BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leet10_491 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<Integer> path;
        List<List<Integer>> result;
        public List<List<Integer>> findSubsequences(int[] nums) {
            path = new ArrayList<>();
            result = new ArrayList<>();
            backtracking(nums, 0);
            return result;
        }

        public void backtracking(int[] nums, int startIndex) {
            if(path.size() >= 2) {
                result.add(new ArrayList<>(path));
            }

            Set<Integer> set = new HashSet<>();

            for(int i = startIndex; i < nums.length; i++) {
                if(!path.isEmpty() && path.get(path.size() - 1) > nums[i]) {
                    continue;
                }

                if(set.contains(nums[i])) {
                    continue;
                }

                set.add(nums[i]);
                path.add(nums[i]);
                backtracking(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
}
