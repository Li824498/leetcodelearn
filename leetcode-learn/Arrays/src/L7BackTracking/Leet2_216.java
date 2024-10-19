package L7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet2_216 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combinationSum3(int k, int n) {
            backtracking(k, n, 0, 1);
            return result;

        }
        public void backtracking(int k, int n, int sum, int startindex){
            if(sum > n){
                return;
            }
            if(path.size() == k){
                if(sum == n){
                    result.add(new ArrayList<>(path));
                }
            }
            for(int i = startindex; i <= 9 - (k - path.size()) + 1; i++){
                path.add(i);
                sum += i;
                backtracking(k, n, sum, i + 1);
//                path.removeLast();
                sum -= i;
            }
        }
    }
}
