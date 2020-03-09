package com.erkuai.dailyalgorithm.interview;

import java.util.ArrayDeque;

public class No239 {
    //给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
//
//
// 返回滑动窗口中的最大值。
//
//
//
// 示例:
//
// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
//输出: [3,3,5,5,6,7]
//解释:
//
//  滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
//
//
//
// 提示：
//
// 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
//
//
//
// 进阶：
//
// 你能在线性时间复杂度内解决此题吗？
// Related Topics 堆 Sliding Window

    //双端队列
    class Solution {
        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
        int[] nums;

        public void clean_deque(int i, int k) {
            if (!deq.isEmpty() && deq.getFirst() == i - k)
                deq.removeFirst();

            while (!deq.isEmpty() && nums[i] > nums[deq.getLast()]) deq.removeLast();
        }

        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if (n * k == 0) return new int[0];
            if (k == 1) return nums;

            // init deque and output
            this.nums = nums;
            int max_idx = 0;
            for (int i = 0; i < k; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                // compute max in nums[:k]
                if (nums[i] > nums[max_idx]) max_idx = i;
            }
            int[] output = new int[n - k + 1];
            output[0] = nums[max_idx];

            // build output
            for (int i = k; i < n; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                output[i - k + 1] = nums[deq.getFirst()];
            }
            return output;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}