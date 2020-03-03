package com.erkuai.dailyalgorithm.leetcode_easy;

public class No746 {

    //数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
//
// 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
//
// 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
//
// 示例 1:
//
//
//输入: cost = [10, 15, 20]
//输出: 15
//解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
//
//
// 示例 2:
//
//
//输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//输出: 6
//解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
//
//
// 注意：
//
//
// cost 的长度将会在 [2, 1000]。
// 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
//
// Related Topics 数组 动态规划

    /**
     * 计算花费 f[i] 有一个清楚的递归关系：f[i] = cost[i] + min(f[i+1], f[i+2])。
     * 我们可以使用动态规划来实现。
     *
     * 当我们要计算 f[i] 时，要先计算出 f[i+1] 和 f[i+2]。所以我们应该从后往前计算 f。
     * 在第 i 步，让 f1，f2 为 f[i+1]，f[i+2] 的旧值，并将其更新为f[i]，f[i+1] 的新值。
     * 当我们从后遍历 i 时，我们会保持这些更新。在最后答案是 min(f1, f2)。
     *
     */

    /**
     * 1
     */
    class Solution {
        //动态规划
        public int minCostClimbingStairs(int[] cost) {
            int f1 = 0, f2 = 0;
            for (int i = cost.length - 1; i >= 0; i--) {
                int f0 = cost[i] + Math.min(f1, f2);
                f2 = f1;
                f1 = f0;
            }
            return Math.min(f1, f2);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
