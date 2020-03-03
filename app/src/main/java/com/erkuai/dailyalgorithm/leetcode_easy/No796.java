package com.erkuai.dailyalgorithm.leetcode_easy;

public class No796 {
    //给定两个字符串, A 和 B。
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。
//
//
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false
//
// 注意：
//
//
// A 和 B 长度不超过 100。
//
//

    /**
     * 1
     */
    class Solution {
        public boolean rotateString(String A, String B) {
            return A.length() == B.length() && (A + A).contains(B);
        }


        //判断一个串是否为另一个串的子串的最优时间复杂度的算法是 KMP 算法。
        //KMP 算法较难理解，这里给出了力扣第 28 题 实现 strstr()
        //https://leetcode-cn.com/problems/implement-strstr/solution/kmp-suan-fa-xiang-jie-by-labuladong/
    }
//leetcode submit region end(Prohibit modification and deletion)

}
