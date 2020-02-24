package com.erkuai.dailyalgorithm.leetcode_easy;

/**
 * Created by Administrator on 2019/12/10 14:55.
 */

public class No434 {

    //统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。
//
// 示例:
//
// 输入: "Hello, my name is John"  /* my 前面是有空格的 */
//输出: 5
//
// Related Topics 字符串

    //若该下标前为空格（或者为初始下标），且自身不为空格，则其为单词开始的下标。

    /**
     * 1
     */

    class Solution {
        public int countSegments(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                    count++;
                }
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
