package L1Array;


/**
 * 长度最小的子数组
 * way1：暴力解法（不如力扣）
 * wat2:滑动窗口
 */
public class leet4_209 {
    public static void main(String[] args) {
//        Solution1 solution1 = new Solution1();
        Solution2 solution = new Solution2();
        System.out.println(solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));

    }

    static class Solution1 {
        public int minSubArrayLen(int target, int[] nums) {
            for(int l = 1; l < nums.length; l++){
                for(int i = 0; i <= nums.length - l; i++){
                    int sum = 0;
                    int[] arr = new int[l];
                    for(int t = 0; t < l; t++) {
                        sum+=nums[i+t];
                        arr[t] = nums[l+t];
                    }
                    if(sum >= target) {
                        return l;
                    }
                }
            }
            return 0;
        }
    }

    static class Solution2 {
        public int minSubArrayLen(int target, int[] nums) {
            int sum = 0;
            int result = nums.length;
            int i = 0;
            for(int j = 0; j < nums.length; j++){
                sum += nums[j];
                while(sum >= target) {
                    int l = j - i + 1;
                    result = Math.min(l, result);
                    sum -= nums[i];
                    i++;
                }
            }
            if (i == 0){
                return 0;
            }
            return result;

        }
    }
}
