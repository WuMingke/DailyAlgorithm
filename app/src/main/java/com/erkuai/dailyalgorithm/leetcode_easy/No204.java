package com.erkuai.dailyalgorithm.leetcode_easy;

import android.util.Log;

import java.util.Arrays;

public class No204 {

    public static void main(String args[]) {
        Solution.countPrimes(10);
    }

    //统计所有小于非负整数 n 的质数的数量。
//
// 示例:
//
// 输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
//
// Related Topics 哈希表 数学


    /**
     * 2
     */

    static class Solution {
        public static int countPrimes(int n) {
            boolean[] isPrim = new boolean[n];
            // 将数组都初始化为 true
            Arrays.fill(isPrim, true);

            for (int i = 2; i < n; i++) {
                if (isPrim[i]) {
                    // i 的倍数不可能是素数了
                    for (int j = 2 * i; j < n; j += i) {//两倍 三倍 四倍。。。
                        isPrim[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrim[i]) {
                    count++;
                }
            }
            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
