package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class No119 {

    //给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
//
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
// 输入: 3
//输出: [1,3,3,1]
//
//
// 进阶：
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？
// Related Topics 数组

    /**
     * 2
     */

    // 打印杨辉三角的第n行

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {

            //打印杨辉三角的第rowIndex行，index从0开始
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int i = 1; i <= rowIndex; i++) {
                for (int j = i - 1; j > 0; j--) {
                    cur.set(j, cur.get(j - 1) + cur.get(j));
                }
                cur.add(1);//补上每层的最后一个 1
            }
            return cur;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
