package com.erkuai.dailyalgorithm.leetcode_easy;

public class No485 {

    //给定一个二进制数组， 计算其中最大连续1的个数。
//
// 示例 1:
//
//
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
//
//
// 注意：
//
//
// 输入的数组只包含 0 和1。
// 输入数组的长度是正整数，且不超过 10,000。
//
// Related Topics 数组

    /**
     * 1
     */
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int ans = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    ans = Math.max(ans, count);
                    count = 0;
                }
            }

            return Math.max(ans, count);//最后一个不知道是1还是非1，故再判断一次
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
