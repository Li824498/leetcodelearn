package L7BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet5_40 {
    public static void main(String[] args) {

    }

    static class Solution {


        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            int[] used;
            Arrays.sort(candidates);
            used = new int[candidates.length];

            backtracking(candidates, target, 0, 0, used, result);
            return result;
        }

        List<Integer> path = new ArrayList<>();
        public void backtracking(int[] candidates, int target, int sum, int startindex, int[] used, List<List<Integer>> result){
            if(sum > target){
                return;
            }
            if(sum == target){
                result.add(new ArrayList<>(path));
                return;
            }

            for(int i = startindex; i < candidates.length; i++){
                if(i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == 0){
                    continue;
                }
                sum += candidates[i];
                path.add(candidates[i]);
                used[i] = 1;
                backtracking(candidates, target, sum, i + 1, used, result);
                sum -= candidates[i];
                path.remove(path.size() - 1);
                used[i] = 0;
            }
        }
    }

}
