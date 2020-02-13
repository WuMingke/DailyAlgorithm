package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class No720 {

    //给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返
//回答案中字典序最小的单词。
//
// 若无答案，则返回空字符串。
//
// 示例 1:
//
//
//输入:
//words = ["w","wo","wor","worl", "world"]
//输出: "world"
//解释:
//单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
//
//
// 示例 2:
//
//
//输入:
//words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
//输出: "apple"
//解释:
//"apply"和"apple"都能由词典中的单词组成。但是"apple"得字典序小于"apply"。
//
//
// 注意:
//
//
// 所有输入的字符串都只包含小写字母。
// words数组长度范围为[1,1000]。
// words[i]的长度范围为[1,30]。
//
// Related Topics 字典树 哈希表


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestWord(String[] words) {
            Set<String> wordset = new HashSet();
            for (String word : words) wordset.add(word);
            Arrays.sort(words, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return a.length() == b.length()
                            ? a.compareTo(b) : b.length() - a.length();
                }
            });
            for (String word : words) {
                boolean good = true;
                for (int k = 1; k < word.length(); ++k) {
                    if (!wordset.contains(word.substring(0, k))) {
                        good = false;
                        break;
                    }
                }
                if (good) return word;
            }

            return "";

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
