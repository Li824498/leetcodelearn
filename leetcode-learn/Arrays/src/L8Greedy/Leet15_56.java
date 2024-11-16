package L8Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet15_56 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> {
                return a[0] - b[0];
            });
            List<int[]> list = new ArrayList<>();
            int left = intervals[0][0];
            int right = intervals[0][1];
            for(int i = 0; i < intervals.length; i++) {
                if(intervals[i][0] > right) {
                    list.add(new int[]{left, right});
                    left = intervals[i][0];
                    right = intervals[i][1];
                }else{
                    right = Math.max(intervals[i][1], right);
                }
            }
            list.add(new int[]{left, right});
            return list.toArray(new int[list.size()][]);
        }
    }

}
