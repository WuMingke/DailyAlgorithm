package com.erkuai.dailyalgorithm.leetcode_easy;

public class No69 {

    //实现 int sqrt(int x) 函数。
//
// 计算并返回 x 的平方根，其中 x 是非负整数。
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
// 示例 1:
//
// 输入: 4
//输出: 2
//
//
// 示例 2:
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,
//     由于返回类型是整数，小数部分将被舍去。
//
// Related Topics 数学 二分查找

    /**
     * 1
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x < 2) return x;

            long num;
            int pivot, left = 2, right = x / 2;
            while (left <= right) {
                pivot = (right + left) / 2;
                num = (long) pivot * pivot;
                if (num > x) right = pivot - 1;
                else if (num < x) left = pivot + 1;
                else return pivot;
            }

            return right;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
