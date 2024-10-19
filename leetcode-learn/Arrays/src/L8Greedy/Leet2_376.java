package L8Greedy;

public class Leet2_376 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int wiggleMaxLength(int[] nums) {

            int prediff = 0;
            int curdiff = 0;
            int count = 1;
            for(int i = 0; i < nums.length - 1; i++){
                curdiff = nums[i+1] - nums[i];
                if((prediff >= 0 && curdiff < 0) || (prediff <= 0 && curdiff > 0)){
                    count++;
                    prediff = curdiff;
                }
            }
            return count;
        }
    }
}
