package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/12/10 15:24.
 */

public class No447 {

    //给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
//
// 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
//
// 示例:
    /**
     * i--k
     * ｜
     * j
     */
//
//
//输入:
//[[0,0],[1,0],[2,0]]
//
//输出:
//2
//
//解释:
//两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
//
// Related Topics 哈希表


    //leetcode submit region begin(Prohibit modification and deletion)

//    将当前点作为第一个点，计算与非当前点的距离，保存在hashMap中，若计算距离在hashMap中已有值，
//    则表明之前有相同的距离，res，因为可以换位，则乘以2，并更新到当前hash中（可以与当前距离相同
//    的任意一个点交换位置）.当前点作为第一个点结束之后，清空hashMap，继续以下一个点作为第一个点。

    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int res = 0;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < points.length; i++) {
                hashMap.clear();
                for (int j = 0; j < points.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    int d = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                            (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);//距离的平方
                    if (hashMap.containsKey(d)) {
                        res += hashMap.get(d) * 2;
                        hashMap.put(d, hashMap.get(d) + 1);
                    } else {
                        hashMap.put(d, 1);
                    }
                }
            }
            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
