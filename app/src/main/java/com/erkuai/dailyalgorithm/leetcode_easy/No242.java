package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;

public class No242 {

    //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    //通过将 s 的字母重新排列成 t 来生成变位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表

    /**
     * 1
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] CharS = s.toCharArray();
            char[] CharT = t.toCharArray();
            Arrays.sort(CharS);
            Arrays.sort(CharT);
            return Arrays.equals(CharS, CharT);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
