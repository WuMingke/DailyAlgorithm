package com.erkuai.dailyalgorithm.leetcode_easy;

public class No7 {

    public static void main(String args[]) {
        System.out.println(Solution.reverse(321));
    }

    //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public static int reverse(int x) {
            int result = 0, a = 0;
            while (x != 0) {
                a = x % 10;  // 得到最低位
                if (result > Integer.MAX_VALUE / 10 || ((Integer.MAX_VALUE / 10) == result && Integer.MAX_VALUE % 10 < a))
                    return 0;   // 考虑溢出问题 数值范围 [-2^31, 2^31 - 1]
                if (result < Integer.MIN_VALUE / 10 || ((Integer.MAX_VALUE / 10) == result && Integer.MIN_VALUE % 10 > a))
                    return 0;
                result = result * 10 + a;
                x = x / 10;
            }
            return result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}

