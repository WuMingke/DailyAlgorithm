package com.erkuai.dailyalgorithm.leetcode_easy;

import android.database.DatabaseUtils;
import android.text.format.DateUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class No697 {

    //给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
//
// 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
//
// 示例 1:
//
//
//输入: [1, 2, 2, 3, 1]
//输出: 2
//解释:
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
//
//
// 示例 2:
//
//
//输入: [1,2,2,3,1,4,2]
//输出: 6
//
//
// 注意:
//
//
// nums.length 在1到50,000区间范围内。
// nums[i] 是一个在0到49,999范围内的整数。
//
// Related Topics 数组


    //leetcode submit region begin(Prohibit modification and deletion)

    /*
    * 具有度数 d 的数组必须有一些元素 x 出现 d 次。如果某些子数组具有相同的度数，那么某些元素 x （出现 d 次）。最短的子数组是将从 x 的第一次出现到最后一次出现的数组。
对于给定数组中的每个元素，让我们知道 left 是它第一次出现的索引； right 是它最后一次出现的索引。例如，当 nums = [1,2,3,2,5] 时，left[2] = 1 和 right[2] = 3。
然后，对于出现次数最多的每个元素 x，right[x] - left[x] + 1 将是我们的候选答案，我们将取这些候选的最小值。
    * */

    /**
     * 不懂？
     */
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> left = new HashMap();
            Map<Integer, Integer> right = new HashMap();
            Map<Integer, Integer> count = new HashMap();

            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                if (left.get(x) == null) left.put(x, i);
                right.put(x, i);
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            int ans = nums.length;
            int degree = Collections.max(count.values());
            for (int x : count.keySet()) {
                if (count.get(x) == degree) {
                    ans = Math.min(ans, right.get(x) - left.get(x) + 1);
                }
            }
            return ans;

        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}
