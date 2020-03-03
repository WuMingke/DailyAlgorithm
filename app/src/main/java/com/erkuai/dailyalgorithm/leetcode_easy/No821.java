package com.erkuai.dailyalgorithm.leetcode_easy;

public class No821 {
    //给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
//
// 示例 1:
//
//
//输入: S = "loveleetcode", C = 'e'
//输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
//
//
// 说明:
//
//
// 字符串 S 的长度范围为 [1, 10000]。
// C 是一个单字符，且保证是字符串 S 里的字符。
// S 和 C 中的所有字母均为小写字母。
//
//

    /**
     * 从左向右遍历，记录上一个字符 C 出现的位置 prev，那么答案就是 i - prev。
     *
     * 从右向左遍历，记录上一个字符 C 出现的位置 prev，那么答案就是 prev - i。
     *
     * 这两个值取最小就是答案。
     *
     *
     */

    /**
     * 1
     */

    class Solution {
        public int[] shortestToChar(String S, char C) {
            int N = S.length();
            int[] ans = new int[N];
            int prev = Integer.MIN_VALUE / 2;

            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == C){
                    prev = i;
                }
                ans[i] = i - prev;
            }

            prev = Integer.MAX_VALUE / 2;
            for (int i = N - 1; i >= 0; i--) {
                if (S.charAt(i) == C){
                    prev = i;
                }
                ans[i] = Math.min(ans[i], prev - i);
            }

            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
