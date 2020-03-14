package com.erkuai.dailyalgorithm.leetcode_easy;

public class No28 {

    // 在haystack中找出第一次needle出现的位置，没有则返回-1

    /**
     * 2
     */


    class Solution {
        public int strStr(String haystack, String needle) {

            final int sourceLength = haystack.length();
            final int targetLength = needle.length();
            final int fromIndex = 0;
            if (fromIndex >= sourceLength) {
                return (targetLength == 0 ? sourceLength : -1);
            }

            if (targetLength == 0) {
                return fromIndex;
            }

            char first = needle.charAt(0);
            int max = (sourceLength - targetLength);

            for (int i = fromIndex; i <= max; i++) {
                /* Look for first character. */
                if (haystack.charAt(i) != first) {
                    while (++i <= max && haystack.charAt(i) != first) ;
                }

                /* Found first character, now look at the rest of v2 */
                if (i <= max) {
                    int j = i + 1;
                    int end = j + targetLength - 1;
                    for (int k = 1; j < end && haystack.charAt(j)
                            == needle.charAt(k); j++, k++);

                    if (j == end) {
                        /* Found whole string. */
                        return i;
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
