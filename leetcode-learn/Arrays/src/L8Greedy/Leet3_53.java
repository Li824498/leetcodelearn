package L8Greedy;

public class Leet3_53 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int result = Integer.MIN_VALUE;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                count += nums[i];
                if(count > result) result = count;
                if(count < 0) count = 0;
            }
            return result;
        }
    }
}
