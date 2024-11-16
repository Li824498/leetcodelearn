package L8Greedy;

import java.util.ArrayList;
import java.util.List;

public class Leet14_763 {
    public static void main(String[] args) {

    }
    static class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> list = new ArrayList<>();
            int[] edge = new int[26];
            for(int i = 0; i < s.length(); i++) {
                edge[s.charAt(i) - 'a'] = i;
            }
            int idx = 0;
            int last = -1;
            for(int i = 0; i < s.length(); i++){
                idx = Math.max(idx, edge[s.charAt(i) - 'a']);
                if(idx == i){
                    list.add(i - last);
                    last = i;
                }
            }
            return list;
        }
    }
}
