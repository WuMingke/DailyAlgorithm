package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.LinkedList;
import java.util.Queue;

public class No566 {
    //在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
//
// 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
//
// 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
//
// 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
//
// 示例 1:
//
//
//输入:
//nums =
//[[1,2],
// [3,4]]
//r = 1, c = 4
//输出:
//[[1,2,3,4]]
//解释:
//行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
//
//
// 示例 2:
//
//
//输入:
//nums =
//[[1,2],
// [3,4]]
//r = 2, c = 4
//输出:
//[[1,2],
// [3,4]]
//解释:
//没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
//
//
// 注意：
//
//
// 给定矩阵的宽和高范围在 [1, 100]。
// 给定的 r 和 c 都是正数。
//
// Related Topics 数组

    /**
     * 通过以行方式读取元素来提取给定矩阵的所有元素。在此实现中，我们使用队列来放置提取的元素。然后，我们可以取出以串行顺序形成的队列元素，并再次按行逐行排列所得到的所需矩阵中的元素。
     *
     * 如果原始矩阵中的元素数量不等于所得矩阵中的元素数量，则不可能形成所得矩阵。
     *
     */

    /**
     * 1
     */
    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int[][] res = new int[r][c];
            if (nums.length == 0 ||
                    r * c != nums.length * nums[0].length) return nums;
            Queue<Integer> list = new LinkedList<>();//先进后出
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    list.add(nums[i][j]);
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = list.remove();
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
