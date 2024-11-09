package L7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet8_78 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            backtracking(nums, 0);
            return result;
        }

        public void backtracking(int[] nums, int startIndex) {
            result.add(new ArrayList<>(path));

//            if(startIndex >= nums.length) return;

            for(int i = startIndex; i < nums.length; i++){
                path.add(nums[i]);
                backtracking(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
}
