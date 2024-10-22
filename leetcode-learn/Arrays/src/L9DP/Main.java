package L9DP;

import java.util.Scanner;

public class Main {

    // n表示邮票面值数，m表示每张信封最多贴的邮票数
    private static int n;
    private static int m;

    // 邮票面值数组
    private static int[] nums;
    // 当前解是否可行
    private static boolean accFlag;
    // 记录区间最大值
    private static int maxValue = 0;
    // 搜索过程中的邮资
    private static int temp = 0;

    public static void main(String[] args) {
        // 读取键盘输入
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            // 多一个是假设有面值为0的邮票
            nums = new int[n + 1];
            nums[0] = 0;
            for (int i = 1; i < n + 1; i++) {
                nums[i] = sc.nextInt();
            }
            solution(n, m, nums);
            System.out.println("maxValue=" + maxValue);
        }
    }

    public static void solution(int n, int m, int[] nums) {
        // 求解区间最大值，一直搜索，直到确定最大值
        while (true) {
            accFlag = false;
            // 每次都从0张邮票开始搜索解空间
            // 当前求解的目标是判断是否存在比当前区间最大值大1的解
            search(0);
            // 若存在
            if (accFlag) {
                // 连续区间增量加1
                maxValue++;
            } else {
                break;
            }
        }
    }

    /**
     * 搜索解空间，找到比当前区间最大值大1的解
     *
     * @param t 当前邮票数量
     */
    public static void search(int t) {
        // 叶节点，结束搜索
        if (t == m) {
            // 当前解可以将连续区间最大值加1
            if (temp == maxValue + 1) {
                accFlag = true;
            }
            // 此时已经是叶节点，若不是可行解，则需要回溯到t-1
            return;
        }
        // 未结束，继续向下搜索
        // 遍历所有面值
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            // 如果当前未达到叶节点，且过程值未达到当前记录的区间最大值，则继续向下搜索
            if (temp <= maxValue + 1) {
                search(t + 1);
            }
            // 若超过了区间最大值，则当前面值不是可行解，需要回溯，计算下一个面值
            temp -= nums[i];
        }
    }
}

