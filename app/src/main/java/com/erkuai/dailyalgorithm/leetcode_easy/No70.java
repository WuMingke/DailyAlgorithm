package com.erkuai.dailyalgorithm.leetcode_easy;

public class No70 {

    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划

    /**
     * 1
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int climbStairs(int n) {
            if (n == 1) return 1;
            int[] steps = new int[n + 1];
            steps[1] = 1;
            steps[2] = 2;
            for (int i = 3; i <= n; i++) {
                //到达第i阶的时候，可以走一步也可以走两步，那么就是
                //走一步+走两步两种方法，一次类推以前，就是方法总数
                steps[i] = steps[i - 1] + steps[i - 2];
            }
            return steps[n];
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.climbStairs(1));
    }
//leetcode submit region end(Prohibit modification and deletion)

}
