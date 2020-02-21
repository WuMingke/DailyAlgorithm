package com.erkuai.dailyalgorithm.leetcode_easy;

public class No168 {

    //给定一个正整数，返回它在 Excel 表中相对应的列名称。
//
// 例如，
//
//     1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//
//
// 示例 1:
//
// 输入: 1
//输出: "A"
//
//
// 示例 2:
//
// 输入: 28
//输出: "AB"
//
//
// 示例 3:
//
// 输入: 701
//输出: "ZY"
//
// Related Topics 数学


    /**
     * 1
     */

    //相当于26进制
    class Solution {
        public String convertToTitle(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            while (n != 0) {
                n--;//这里稍作处理，因为它是从1开始
                stringBuilder.append((char) (n % 26 + 'A'));
                n /= 26;
            }
            return stringBuilder.reverse().toString();

        }
    }

    public static void main(String[] args) {
        System.out.println((char) (1 + 'A'));
    }
//leetcode submit region end(Prohibit modification and deletion)

}
