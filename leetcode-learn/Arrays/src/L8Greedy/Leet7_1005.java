package L8Greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Leet7_1005 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            nums = IntStream.of(nums)
                    .boxed()
                    .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                    .mapToInt(Integer::intValue)
                    .toArray();

            int len = nums.length;
            for(int i = 0; i < len; i++){
                if(k > 0 && nums[i] < 0){
                    nums[i] *= -1;
                    k--;
                }
            }

            if(k%2 == 1){
                nums[nums.length - 1] *= -1;
            }

            int sum = 0;
            for(int num:nums){
                sum += num;
            }

            return Arrays.stream(nums).sum();



        }
    }
}
