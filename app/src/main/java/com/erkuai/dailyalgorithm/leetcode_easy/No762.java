package com.erkuai.dailyalgorithm.leetcode_easy;

public class No762 {

    //给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
//
// （注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
//
// 示例 1:
//
//
//输入: L = 6, R = 10
//输出: 4
//解释:
//6 -> 110 (2 个计算置位，2 是质数)
//7 -> 111 (3 个计算置位，3 是质数)
//9 -> 1001 (2 个计算置位，2 是质数)
//10-> 1010 (2 个计算置位，2 是质数)
//
//
// 示例 2:
//
//
//输入: L = 10, R = 15
//输出: 5
//解释:
//10 -> 1010 (2 个计算置位, 2 是质数)
//11 -> 1011 (3 个计算置位, 3 是质数)
//12 -> 1100 (2 个计算置位, 2 是质数)
//13 -> 1101 (3 个计算置位, 3 是质数)
//14 -> 1110 (3 个计算置位, 3 是质数)
//15 -> 1111 (4 个计算置位, 4 不是质数)
//
//
// 注意:
//
//
// L, R 是 L <= R 且在 [1, 10^6] 中的整数。
// R - L 的最大值为 10000。
//
// Related Topics 位运算

    /**
     * 从 L 到 R，我们首先计算该数字转换为二进制有多少个 1。
     * 如果数量是 2, 3, 5, 7, 11, 13, 17, 19，则我们增加计数。
     * 最高是 19 的原因是 R≤10^6<2^20
     *
     * 10^6，转换为二进制，有 20 位，故 计算置位 个数不会超过 20。
     */

    /**
     * 1
     */
    class Solution {
        public int countPrimeSetBits(int L, int R) {
            int ans = 0;
            for (int x = L; x <= R; x++)
                if (isSmallPrime(Integer.bitCount(x)))
                    ans++;
            return ans;
        }

        public boolean isSmallPrime(int x) {
            return (x == 2 || x == 3 || x == 5 || x == 7 ||
                    x == 11 || x == 13 || x == 17 || x == 19);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
