package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Arrays;

public class No88 {

    //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
// 说明:
//
//
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//
//
// 示例:
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6]
// Related Topics 数组 双指针

    /**
     * 1
     */

//    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//
//    src:源数组;
//
//    srcPos:源数组要复制的起始位置;
//
//    dest:目的数组;
//
//    destPos:目的数组放置的起始位置;
//
//    length:复制的长度.

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
//            // Make a copy of nums1.
//            int[] nums1_copy = new int[m];
//            System.arraycopy(nums1, 0, nums1_copy, 0, m);
//
//            // Two get pointers for nums1_copy and nums2.
//            int p1 = 0;
//            int p2 = 0;
//
//            // Set pointer for nums1
//            int p = 0;
//
//            // Compare elements from nums1_copy and nums2
//            // and add the smallest one into nums1.
//            while ((p1 < m) && (p2 < n))
//                nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
//
//            // if there are still elements to add
//            if (p1 < m)
//                System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
//            if (p2 < n)
//                System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
