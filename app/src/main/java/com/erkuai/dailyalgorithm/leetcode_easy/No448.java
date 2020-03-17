package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2019/12/10 15:34.
 */

public class No448 {

    public static void main(String args[]) {
        List<Integer> list =
                Solution.findDisappearedNumbers(new int[]{3, 3, 2, 1, 4, 5, 6, 4});

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // System.out.println(list.toString());
    }

    //给定一个范围在 1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，
    // 另一些只出现一次。
//
// 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
//
// 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
//
// 示例:
//
//
//输入:
//[4,3,2,7,8,2,3,1]
//
//输出:
//[5,6]
//
// Related Topics 数组

    /**
     * 1
     */

    //数组里的值是连续的

    static class Solution {
        public static List<Integer> findDisappearedNumbers(int[] nums) {

            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], true);
            }
            List<Integer> result = new LinkedList<>();

            for (int i = 1; i <= nums.length; i++) {
                if (!map.containsKey(i)) {
                    result.add(i);
                }
            }

            return result;

        }
    }

}
