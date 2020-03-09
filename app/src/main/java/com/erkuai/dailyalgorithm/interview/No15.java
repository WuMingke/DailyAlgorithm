package com.erkuai.dailyalgorithm.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class No15 {
    //给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三
//元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例：
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> result = new LinkedHashSet<>();

            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int head = i + 1;
                int tail = nums.length - 1;
                while (head < tail) {
                    int sum = -(nums[head] + nums[tail]);
                    if (sum == nums[i]) {
                        List<Integer> value = Arrays.asList(nums[i], nums[head], nums[tail]);
                        result.add(value);
                    }
                    if (sum <= nums[i]) {
                        tail--;
                    } else {
                        head++;
                    }
                }

            }
            return new ArrayList<>(result);
        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}
