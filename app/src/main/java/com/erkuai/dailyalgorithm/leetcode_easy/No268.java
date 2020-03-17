package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;

public class No268 {

    //给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
//
// 示例 1:
//
// 输入: [3,0,1]
//输出: 2
//
//
// 示例 2:
//
// 输入: [9,6,4,2,3,5,7,0,1]
//输出: 8
//
//
// 说明:
//你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
// Related Topics 位运算 数组 数学

    /**
     * 2
     */

    class Solution {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);

            //这里0～n，1个数，就是0～1，就是要两个数，所以直接for循环有问题。

            // 判断 n 是否出现在末位
            if (nums[nums.length - 1] != nums.length) {
                return nums.length;
            }
            // 判断 0 是否出现在首位
            else if (nums[0] != 0) {
                return 0;
            }

            // 此时缺失的数字一定在 (0, n) 中
            for (int i = 1; i < nums.length; i++) {
                int expectedNum = nums[i - 1] + 1;
                if (nums[i] != expectedNum) {
                    return expectedNum;
                }
            }

            // 未缺失任何数字（保证函数有返回值）
            return -1;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
