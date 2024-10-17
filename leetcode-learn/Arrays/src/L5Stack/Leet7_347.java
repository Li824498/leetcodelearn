package L5Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leet7_347 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();

            for(int num:nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);

            for(Map.Entry<Integer, Integer> entry:map.entrySet()){
                if(pq.size() < k){
                    pq.add(new int[]{entry.getKey(), entry.getValue()});
                }else{
                    if(entry.getValue() > pq.peek()[1]){
                        pq.poll();
                        pq.add(new int[]{entry.getKey(), entry.getValue()});
                    }
                }
            }

            int[] ans = new int[k];
            for(int i = k-1; i >= 0; i--){
                ans[i] = pq.poll()[0];
            }
            return ans;

        }
    }
}
