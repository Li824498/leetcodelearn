package Array;

public class leet5_59 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateMatrix(4));

    }

    static class Solution {
        public int[][] generateMatrix(int n) {
            int startx = 0;
            int starty = 0;
            int offset = 1;
            int count = 1;
            int[][] nums = new int[n][n];

            for(int loop = 0; loop < n / 2; loop++) {
                int j = startx;
                int i = starty;
                for (; j < n - offset; j++) {
                    nums[startx][j] = count++;
                }
                for (; i < n - offset; i++) {
                    nums[i][j] = count++;
                }
                for (; j > startx; j--) {
                    nums[i][j] = count++;
                }
                for (; i > starty; i--) {
                    nums[i][j] = count++;
                }
                offset++;
                startx++;
                starty++;
            }

            if(n % 2 == 1) {
                nums[n/2 + 1][n/2+1] = count;
            }

            return nums;

        }
    }
}
