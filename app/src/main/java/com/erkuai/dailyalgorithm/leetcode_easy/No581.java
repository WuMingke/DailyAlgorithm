package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;

public class No581 {
    //给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
//
// 你找到的子数组应是最短的，请输出它的长度。
//
// 示例 1:
//
//
//输入: [2, 6, 4, 8, 10, 9, 15]
//输出: 5
//解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
//
//
// 说明 :
//
//
// 输入的数组长度范围在 [1, 10,000]。
// 输入的数组可能包含重复元素 ，所以升序的意思是<=。
//
// Related Topics 数组

    //比较 nums 和 clone 的元素来决定最左边和最右边不匹配的元素。
    // 它们之间的子数组就是要求的最短无序子数组。

    /**
     * 1
     */

    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            //int[] clone = nums.clone();
            int[] clone = Arrays.copyOf(nums, nums.length);
            Arrays.sort(clone);
            int start = clone.length, end = 0;
            for (int i = 0; i < clone.length; i++) {
                if (clone[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start > 0 ? end - start + 1 : 0);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
