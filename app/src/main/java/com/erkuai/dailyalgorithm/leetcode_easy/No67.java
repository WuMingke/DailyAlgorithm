package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Collections;

public class No67 {

    public static void main(String args[]) {
        int[] ints = {1, 0};
        System.out.println(ints[0] - '0');
    }

    //给定两个二进制字符串，返回他们的和（用二进制表示）。
//
// 输入为非空字符串且只包含数字 1 和 0。
//
// 示例 1:
//
// 输入: a = "11", b = "1"
//输出: "100"
//
// 示例 2:
//
// 输入: a = "1010", b = "1011"
//输出: "10101"
// Related Topics 数学 字符串

    /**
     * 1
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder ans = new StringBuilder();
            int jingWei = 0;  // 用此向前进 1 位 的值
            int sum = 0;      // 用于记录两个字符相加的值
            for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
                // 用于记录进位的值,如果进了1位,则jingWei = 1,sum 就初始化为1,sum用于下次和 字符a,b的值相加.
                sum = jingWei;
                // 如果 i >= 0,则证明下标还没超出a的长度,代表还有元素,否则,则证明已经超出a的长度,那就用一个0代表值来相加
                sum += i >= 0 ? a.charAt(i) - '0' : 0;
                // 如果 j >= 0,则证明下标还没超出b的长度,代表还有元素,否则,则证明已经超出b的长度,那就用一个0代表值来相加
                sum += j >= 0 ? b.charAt(j) - '0' : 0;
                // 因为是二进制,所以是满二进一,这里求模,如果sum是0和1,那求完模之后就还是0和1,要是2的话,求模后等于0,要向前进1.
                ans.append(sum % 2);
                // 如果sum是0和1,运算完直接就是0了,不用进位,如果是2,那就需要向前进1.
                jingWei = sum / 2;
            }
            ans.append(jingWei == 1 ? jingWei : ""); // 在循环结束后,如果进位变量仍为1,则证明步最后还有进位
            return ans.reverse().toString();       //因为append求出的ans值顺序相反,所以需要将字符串进行反转

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
