package L3HashMap;

import java.util.HashMap;
import java.util.Map;

public class Leet4_454 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int a:nums1) {
                for(int b:nums2){
                    map.put(a+b, map.getOrDefault(a+b, 0) + 1);
                }
            }
            for(int c:nums3){
                for(int d:nums4){
                    int temp = 0 - c - d;
                    count += map.getOrDefault(temp, 0);
                }
            }
            return count;
        }
    }
}
