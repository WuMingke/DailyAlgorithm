package com.erkuai.dailyalgorithm.leetcode_easy;

public class No476 {

    //给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
//
// 注意:
//
//
// 给定的整数保证在32位带符号整数的范围内。
// 你可以假定二进制数不包含前导零位。
//
//
// 示例 1:
//
//
//输入: 5
//输出: 2
//解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
//
//
// 示例 2:
//
//
//输入: 1
//输出: 0
//解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
//
// Related Topics 位运算

    /**
     * 题目要求即将num二进制各位由1变成0，0变成1，由此想到将各位与1做异或操作即可。如何找到与num二进制有效位（没有前导零位）个数相同且都是1的数呢？
     * 只要找到比num最高1位的位置高一位（左边）就行了，此时该数必然大于num，如num=5（101B）时，这个数为8（1000B），将其减1，则得到与num有效二进制位数相同且各位都为1的数。如8-1=7（111B）
     *
     */

    /**
     * 1
     */

    class Solution {
        public int findComplement(int num) {
            long num0 = 1;

            while (num0 <= num)
                num0 = num0 << 1;

            num0 -= 1;

            return (int) num0 ^ num;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
