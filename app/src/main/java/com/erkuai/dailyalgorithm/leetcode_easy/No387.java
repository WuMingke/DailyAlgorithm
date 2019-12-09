package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class No387 {

    //给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
// 案例:
//
//
//s = "leetcode"
//返回 0.
//
//s = "loveleetcode",
//返回 2.
//
//
//
//
// 注意事项：您可以假定该字符串只包含小写字母。
// Related Topics 哈希表 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstUniqChar(String s) {
            HashMap<Character, Integer> count = new HashMap<Character, Integer>();

            int length = s.length();

            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (count.containsKey(c)) {
                    Integer integer = count.get(c);
                    count.put(c, integer++);
                } else {
                    count.put(c, 0);
                }
            }

            for (int i = 0; i < length; i++) {
                if (count.get(s.charAt(i)) == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
