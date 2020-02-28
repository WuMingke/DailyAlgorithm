package com.erkuai.dailyalgorithm.leetcode_easy;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No599 {
    //假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
//
// 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
//
// 示例 1:
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//输出: ["Shogun"]
//解释: 他们唯一共同喜爱的餐厅是“Shogun”。
//
//
// 示例 2:
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//输出: ["Shogun"]
//解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
//
//
// 提示:
//
//
// 两个列表的长度范围都在 [1, 1000]内。
// 两个列表中的字符串的长度将在[1，30]的范围内。
// 下标从0开始，到列表的长度减1。
// 两个列表都没有重复的元素。
//
// Related Topics 哈希表

    /**
     * 1
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            HashMap<Integer, List<String>> map = new HashMap<>();
            for (int i = 0; i < list1.length; i++) {
                for (int j = 0; j < list2.length; j++) {
                    if (list1[i].equals(list2[j])) {
                        if (!map.containsKey(i + j)) {
                            map.put(i + j, new ArrayList<String>());
                        }
                        map.get(i + j).add(list1[i]);
                    }
                }
            }
            int min_index_sum = Integer.MAX_VALUE;
            for (int key : map.keySet()) {
                min_index_sum = Math.min(min_index_sum, key);
            }
            String[] res = new String[map.get(min_index_sum).size()];
            return map.get(min_index_sum).toArray(res);

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] restaurant = solution.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"});
        for (int i = 0; i < restaurant.length; i++) {
            System.out.println(restaurant[i]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
