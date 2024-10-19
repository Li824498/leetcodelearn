package L7BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet4_40 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            backtracking(candidates, target, 0, 0);

            return result;

        }

        List<Integer> path = new ArrayList<>();
        public void backtracking(int[] candidates, int target, int sum, int startindex){
            if(sum > target){
                return;
            }
            if(sum == target){
                result.add(new ArrayList<>(path));
                return;
            }

            for(int i = startindex; i < candidates.length; i++){
                if(sum + candidates[i] > target){
                    break;
                }
                path.add(candidates[i]);
                sum += candidates[i];
                backtracking(candidates, target, sum, i);
//                path.removeLast();
                sum -= candidates[i];
            }
        }
    }

}
