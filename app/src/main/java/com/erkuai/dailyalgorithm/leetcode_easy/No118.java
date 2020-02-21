package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class No118 {

    //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
//
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
// Related Topics 数组


    /**
     * 1
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        //打印杨辉三角的前numRows行，index从1开始
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
            if (numRows == 0) return triangle;
            triangle.add(new ArrayList<Integer>());
            triangle.get(0).add(1);
            for (int i = 1; i < numRows; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                List<Integer> list = triangle.get(i - 1);
                row.add(1);
                for (int j = 1; j < i; j++) {
                    row.add(list.get(j - 1) + list.get(j));
                }
                row.add(1);

                triangle.add(row);
            }
            return triangle;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
