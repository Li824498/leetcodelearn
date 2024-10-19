package L8Greedy;

public class Leet6_45 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int jump(int[] nums) {
            int cover = 0;
            int result = 0;
            int next = 0;
            int curMax = 0;
            if(nums.length == 1) return 0;

            for(int i = 0; i < nums.length; i++){
                next = Math.max(next, i + nums[i]);
                if(curMax == i){
                    if(curMax < nums.length - 1){
                        result++;
                        curMax = next;
                        if(curMax >= nums.length - 1) break;
                    }
                }

            }
            return result;


        }
    }
}
