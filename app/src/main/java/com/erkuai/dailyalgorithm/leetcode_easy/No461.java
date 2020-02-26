package com.erkuai.dailyalgorithm.leetcode_easy;

public class No461 {

    //两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
//
// 给出两个整数 x 和 y，计算它们之间的汉明距离。
//
// 注意：
//0 ≤ x, y < 231.
//
// 示例:
//
//
//输入: x = 1, y = 4
//
//输出: 2
//
//解释:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//上面的箭头指出了对应二进制位不同的位置。
//
// Related Topics 位运算

    /**
     * 异或运算：相同的为0，不同的为1
     * 将两个数做异或运算，然后计算1的个数即是答案。
     */

    /**
     * 1
     */
    class Solution {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
