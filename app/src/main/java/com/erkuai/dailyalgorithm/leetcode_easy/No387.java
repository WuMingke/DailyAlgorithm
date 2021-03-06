package com.erkuai.dailyalgorithm.leetcode_easy;

import android.os.Build;
import android.support.annotation.RequiresApi;

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


    /**
     * 2
     *
     * 同No383
     */

    /**
     * 跟生成26个字母的数组然后计数的逻辑差不多
     */
    class Solution {
        @RequiresApi(api = Build.VERSION_CODES.N)
        public int firstUniqChar(String s) {
            int[] ints = new int[26];
            for (int i = 0; i < s.length(); i++) {
                ints[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                if (ints[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
//            HashMap<Character, Integer> count = new HashMap<>();
//            int n = s.length();
//            // build hash map : character and how often it appears
//            for (int i = 0; i < n; i++) {
//                char c = s.charAt(i);
//                count.put(c, count.getOrDefault(c, 0) + 1);
//            }
//
//            // find the index
//            for (int i = 0; i < n; i++) {
//                if (count.get(s.charAt(i)) == 1)
//                    return i;
//            }
//            return -1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
