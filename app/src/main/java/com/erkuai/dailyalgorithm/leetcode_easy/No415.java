package com.erkuai.dailyalgorithm.leetcode_easy;

public class No415 {

    //给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//
// 注意：
//
//
// num1 和num2 的长度都小于 5100.
// num1 和num2 都只包含数字 0-9.
// num1 和num2 都不包含任何前导零。
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
//
// Related Topics 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addStrings(String num1, String num2) {
            int carry = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
                int a = (i >= 0) ? num1.charAt(i) - '0' : 0;
                int b = (j >= 0) ? num2.charAt(j) - '0' : 0;
                int sum = a + b + carry;
                builder.append(sum % 10);
                carry = sum / 10;
            }
            if (carry > 0) builder.append("1");
            return builder.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
