package com.erkuai.dailyalgorithm.leetcode_easy;

public class No633 {

    //给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
//
// 示例1:
//
//
//输入: 5
//输出: True
//解释: 1 * 1 + 2 * 2 = 5
//
//
//
//
// 示例2:
//
//
//输入: 3
//输出: False
//
// Related Topics 数学

    /**
     * 1
     */
    class Solution {
        public boolean judgeSquareSum(int c) {
            for (long a = 0; a * a <= c; a++) {
                double v = Math.sqrt(c - a * a);
                if (v == (int) v) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
