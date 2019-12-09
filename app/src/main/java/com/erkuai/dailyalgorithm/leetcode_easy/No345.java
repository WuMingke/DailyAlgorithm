package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class No345 {

    //编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//
// 示例 1:
//
// 输入: "hello"
//输出: "holle"
//
//
// 示例 2:
//
// 输入: "leetcode"
//输出: "leotcede"
//
// 说明:
//元音字母不包含字母"y"。
// Related Topics 双指针 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //双指针，是元音，就停下来等待交换
        private HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' )
        );

        public String reverseVowels(String s) {
            if (s == null) return null;
            int i = 0, j = s.length() - 1;
            char[] result = new char[s.length()];
            while (i <= j) {
                char c = s.charAt(i);
                char c1 = s.charAt(j);
                if (!vowels.contains(c)) {
                    result[i++] = c;
                } else if (!vowels.contains(c1)) {
                    result[j--] = c1;
                } else {
                    result[i++] = c1;
                    result[j--] = c;
                }
            }
            return new String(result);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
