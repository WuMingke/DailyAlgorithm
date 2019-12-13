package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/12/10 15:34.
 */

public class No448 {

    public static void main(String args[]) {
        List<Integer> list =
                Solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
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


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> res = new ArrayList<Integer>();
            int n = nums.length;
            //第一轮，将所有出现过的值对应的位置变为负数
            for(int i=0;i<n;i++){
                int index = Math.abs(nums[i]) - 1;
                nums[index] = Math.abs(nums[index]) * -1;
            }

            //第二轮，统计不为负数的（就是没出现过的）
            for(int i=0;i<n;i++){
                if(nums[i] > 0)
                    res.add(i+1);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
