package com.erkuai.dailyalgorithm.leetcode_easy;

public class No14 {

    public static void main(String args[]) {
        String a = "abcdef";
        String b = "g";
        int i = a.indexOf(b);
        System.out.println(i);
    }
    //编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
// Related Topics 字符串

    /**
     * 2
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String pre = strs[0];
            for (int i = 1; i < strs.length; i++) {
                //把第一个提出来，假设它就是最短的那个，然后开始两两比较
                while (strs[i].indexOf(pre) != 0) {//前缀都是第一个
                    pre = pre.substring(0, pre.length() - 1);
                    if (pre.isEmpty()) return "";
                }
            }
            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
