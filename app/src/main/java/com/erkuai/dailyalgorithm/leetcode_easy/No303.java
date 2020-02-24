package com.erkuai.dailyalgorithm.leetcode_easy;

public class No303 {

    //给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。
//
// 示例：
//
// 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
//
// 说明:
//
//
// 你可以假设数组不可变。
// 会多次调用 sumRange 方法。
//
// Related Topics 动态规划

    /**
     * 用一个数组存储前n项的和，然后在最终计算的时候，减掉就行了。
     */

    /**
     * 1
     */

    static class NumArray {

        private int[] sum;

        public NumArray(int[] nums) {
            sum = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j + 1] - sum[i];
        }
    }

    public static void main(String[] args) {
        int[] ints = {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(ints);

        System.out.println(array.sumRange(0,2));

    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
