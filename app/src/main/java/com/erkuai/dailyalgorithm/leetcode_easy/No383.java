package com.erkuai.dailyalgorithm.leetcode_easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No383 {

    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//
// (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
//
// 注意：
//
// 你可以假设两个字符串均只含有小写字母。
//
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
//
// Related Topics 字符串

    /**
     * 1
     */

    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] num = new int[26]; //定义一个int型数组，来统计每个字符出现的次数
            for (int i = 0; i < magazine.length(); i++) {
                num[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                if (num[ransomNote.charAt(i) - 'a'] == 0) { //如果该字母出现次数为0，则返回false
                    return false;
                }
                num[ransomNote.charAt(i) - 'a']--; //否则将该字母可用次数减一
            }
            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
