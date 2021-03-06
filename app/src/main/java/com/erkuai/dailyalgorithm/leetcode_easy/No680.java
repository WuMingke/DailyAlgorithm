package com.erkuai.dailyalgorithm.leetcode_easy;

public class No680 {

    //给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
//
// 示例 1:
//
//
//输入: "aba"
//输出: True
//
//
// 示例 2:
//
//
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
//
//
// 注意:
//
//
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
//
// Related Topics 字符串

    /**
     * 使用双指针可以很容易判断一个字符串是否是回文字符串：
     * 令一个指针从左到右遍历，一个指针从右到左遍历，这两个指针同时移动一个位置，
     * 每次都判断两个指针指向的字符是否相同，如果都相同，字符串才是具有左右对称性质的回文字符串。
     */

    /**
     * 1
     */
    class Solution {

        //双指针
        public boolean validPalindrome(String s) {
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    //分两种情况，一是右边减一，二是左边加一
                    return isPalindrome(s, i, j - 1) ||
                            isPalindrome(s, i + 1, j);
                }
            }
            return true;
        }

        public boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i++) != s.charAt(j--)) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
