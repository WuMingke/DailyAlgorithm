package com.erkuai.dailyalgorithm.leetcode_easy;

public class No541 {

    //给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于
// 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
//
// 示例:
//
//
//输入: s = "abcdefg", k = 2
//输出: "bacdfeg"
//
//
// 要求:
//
//
// 该字符串只包含小写的英文字母。
// 给定字符串的长度和 k 在[1, 10000]范围内。
//
// Related Topics 字符串

    /**
     * 1
     */
    class Solution {
        public String reverseStr(String s, int k) {
            char[] s_arr = s.toCharArray();

            for (int i = 0; i < s_arr.length; ) {
                //反转k
                if (i + k >= s_arr.length) {
                    reverseArr(s_arr, i, s_arr.length - 1);
                    break;
                } else {
                    reverseArr(s_arr, i, i + k - 1);
                }
                i += k;

                //跳过k
                if (i + k >= s_arr.length) {
                    break;
                }
                i += k;
            }
            return String.valueOf(s_arr);

        }

        public void reverseArr(char[] arr, int from, int to) {
            for (int i = from, j = to; i < j; i++, j--) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
