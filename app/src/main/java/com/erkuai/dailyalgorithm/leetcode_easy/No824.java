package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class No824 {
    //给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
//
// 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
//
// 山羊拉丁文的规则如下：
//
//
// 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
// 例如，单词"apple"变为"applema"。
//
// 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
// 例如，单词"goat"变为"oatgma"。
//
// 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
// 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
//
//
// 返回将 S 转换为山羊拉丁文后的句子。
//
// 示例 1:
//
//
//输入: "I speak Goat Latin"
//输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//
//
// 示例 2:
//
//
//输入: "The quick brown fox jumped over the lazy dog"
//输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaa
//aaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
//
//
// 说明:
//
//
// S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
// 1 <= S.length <= 150。
//
// Related Topics 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String toGoatLatin(String S) {
            Set<Character> vowel = new HashSet();
            for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'})
                vowel.add(c);

            int t = 1;
            StringBuilder ans = new StringBuilder();
            for (String word : S.split(" ")) {
                char first = word.charAt(0);
                if (vowel.contains(first)) {
                    ans.append(word);
                } else {
                    ans.append(word.substring(1));
                    ans.append(word.substring(0, 1));
                }
                ans.append("ma");
                for (int i = 0; i < t; i++)
                    ans.append("a");
                t++;
                ans.append(" ");
            }

            ans.deleteCharAt(ans.length() - 1);
            return ans.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}