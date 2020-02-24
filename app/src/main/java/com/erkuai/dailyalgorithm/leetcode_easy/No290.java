package com.erkuai.dailyalgorithm.leetcode_easy;

public class No290 {

    //给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
//
// 示例1:
//
// 输入: pattern = "abba", str = "dog cat cat dog"
//输出: true
//
// 示例 2:
//
// 输入:pattern = "abba", str = "dog cat cat fish"
//输出: false
//
// 示例 3:
//
// 输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false
//
// 示例 4:
//
// 输入: pattern = "abba", str = "dog dog dog dog"
//输出: false
//
// 说明:
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
// Related Topics 哈希表


    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 1.第一步： pattern = "abba" = "1221"
     * 2.第二步： strs = "dog cat cat dog" = "1221"
     * 3.第三步： "1221" ?= "1221"
     *
     * 判断首次出现的index
     */

    /**
     * 1
     */
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] strs= str.split(" ");
            if (strs.length != pattern.length()) return false;
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.indexOf(pattern.charAt(i))
                        != indexOf(strs, strs[i])) {
                    return false;
                }
            }
            return true;
        }


        public int indexOf(String[] arrays, String searchString) {
            int ans = -1;
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].equals(searchString)) {
                    ans = i;
                    break;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
