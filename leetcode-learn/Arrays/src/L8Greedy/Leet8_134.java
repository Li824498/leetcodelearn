package L8Greedy;

public class Leet8_134 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int curSum = 0;
            int totalSum = 0;
            int index = 0;
            for(int i = 0; i < gas.length; i++) {
                curSum += gas[i] - cost[i];
                totalSum += gas[i] - cost[i];
                if(curSum < 0) {
                    curSum = 0;
                    index = i + 1;
                }
            }
            if(totalSum < 0) return -1;
            return index;
        }
    }
}
