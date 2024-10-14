package L3HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;

/**
 * way1: hashset
 * way2: hasharray
 * way3: hasharray
 */
public class Leet2_349 {
    public static void main(String[] args) {

    }
    static class Solution1 {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1 == null||nums1.length == 0||nums2 == null||nums2.length == 0) {
                return new int[0];
            }
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> resset = new HashSet<Integer>();

            for(int i:nums1){
                set1.add(i);
            }
            for(int i:nums2){
                if(set1.contains(i)){
                    resset.add(i);
                }
            }
//            return resset.stream().mapToInt(x->x).toArray();
            return resset.stream().mapToInt(value->value).toArray();
        }
    }
    static class Solution2 {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] arr = new int[1005];
            Set<Integer> resset = new HashSet<>();

            for(int i:nums1) {
                arr[i] = 1;
            }
            for(int i:nums2) {
                if(arr[i] == 1){
                    resset.add(i);
                }
            }
            return resset.stream().mapToInt(x->x).toArray();

        }
    }

    static class Solution3 {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] hash1 = new int[1001];
            int[] hash2 = new int[1001];
            List<Integer> reslist = new ArrayList<>();

            for(int i:nums1){
                hash1[i] = 1;
            }
            for(int i:nums2){
                hash2[i] = 1;
            }
            for(int i = 0; i < 1001; i++){
                if(hash1[i] == 1 && hash2[i] == 1) {
                    reslist.add(i);
                }
            }
            int index = 0;
            int[] res = new int[reslist.size()];
            for(int i:reslist){
                res[index++] = i;
            }
            return res;
        }
    }
}
