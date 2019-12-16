package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class No500 {

    //给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
//
//
//
//
//
//
//
// 示例：
//
// 输入: ["Hello", "Alaska", "Dad", "Peace"]
//输出: ["Alaska", "Dad"]
//
//
//
//
// 注意：
//
//
// 你可以重复使用键盘上同一字符。
// 你可以假设输入的字符串将只包含字母。
// Related Topics 哈希表


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {
            if (words == null) {
                return null;
            }

            List<String> ans = new ArrayList<>();

            // 字典行
            String lines[] = new String[]{
                    "qwertyuiop",
                    "asdfghjkl",
                    "zxcvbnm"
            };

            // 挨个单词匹配是否满足条件
            for (String word : words) {
                if (judge(word.toLowerCase(), lines)) {
                    ans.add(word);
                }
            }

            // 刚看到的时候有点疑惑返回值为什么不是List<String>而是String[]
            // list可直接利用API转换为String数组即可
            return ans.toArray(new String[ans.size()]);
        }

        private boolean judge(String word, String[] lines) {
            boolean ok = true;
            String find = null;

            // 先用word首字符确定属于哪一行
            for (String line : lines) {
                if (line.indexOf(word.charAt(0)) > -1) {
                    find = line;
                    break;
                }
            }

            if (find == null) {
                ok = false;
                return ok;
            }

            // 判断word字符串所有字符是否都属于同一行
            for (int i = 1; i < word.length(); i++) {
                if (find.indexOf(word.charAt(i)) < 0) {
                    ok = false;
                    break;
                }
            }

            return ok;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
