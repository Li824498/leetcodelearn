package L1Array;

public class leet5_59 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateMatrix(4));

    }
static class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startx = 0;
        int starty = 0;
        int offset = 1;
        int count = 1;
        for(int loop = 0; loop < n/2; loop++){
            int i = startx;
            int j = starty;
            for(; i < n - offset; i++){
                nums[j][i] = count++;
            }
            for(; j < n- offset; j++){
                nums[j][i] = count++;
            }
            for(; i > startx; i--) {
                nums[j][i] = count++;
            }
            for(; j > starty; j--) {
                nums[j][i] = count++;
            }
            startx++;
            starty++;
            offset++;
        }
        if(n%2 == 1){
            nums[n/2][n/2] = count;
        }
        return nums;

    }
}
}
