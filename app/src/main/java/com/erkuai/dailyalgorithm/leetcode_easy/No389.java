package com.erkuai.dailyalgorithm.leetcode_easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class No389 {

    //给定两个字符串 s 和 t，它们只包含小写字母。
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//
// 请找出在 t 中被添加的字母。
//
//
//
// 示例:
//
// 输入：
//s = "abcd"
//t = "abcde"
//
//输出：
//e
//
//解释：
//'e' 是那个被添加的字母。
//
// Related Topics 位运算 哈希表

    /**
     * 1
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chart);
            char ans = 0;
            for (int i = 0; i < chart.length; i++) {
                if (i < chars.length && chart[i] != chars[i]) {
                    ans = chart[i];
                    break;
                }

                if (i >= chars.length) {
                    return chart[chart.length - 1];
                }
            }
            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
