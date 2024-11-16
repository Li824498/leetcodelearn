package L8Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leet11_406 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, (a, b) -> {
                if(a[0] == b[0]) return a[1] - b[1];
                return b[0] - a[0];
            });
            List<int[]> que = new LinkedList<>();
            for(int[] p : people) {
                que.add(p[1], p);
            }
            return que.toArray(new int[people.length][]);
        }
    }
}
