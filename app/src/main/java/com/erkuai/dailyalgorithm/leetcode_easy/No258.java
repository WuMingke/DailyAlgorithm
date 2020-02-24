package com.erkuai.dailyalgorithm.leetcode_easy;

public class No258 {

    //给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
//
// 示例:
//
// 输入: 38
//输出: 2
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
//
//
// 进阶:
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
// Related Topics 数学


    //leetcode submit region begin(Prohibit modification and deletion)
//
//    当数字为0-9时，结果为它本身，
//    当数字大于9，且为9的倍数时，结果为9，
//    当数字大于9，且不为9的倍数时，结果为该数mod 9 的余数
//

    /**
     * 1
     */

    class Solution {
        public int addDigits(int num) {
            if (num <= 9) {
                return num;
            } else if (num % 9 == 0) {
                return 9;
            } else {
                return num % 9;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
