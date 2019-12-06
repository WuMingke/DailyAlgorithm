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


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public static int countPrimes(int n) {
            //埃拉托斯特尼筛法
            boolean[] isPrim = new boolean[n];
            Arrays.fill(isPrim, true);
            for (int i = 2; i * i < n; i++)
                if (isPrim[i])
                    for (int j = i * i; j < n; j += i)
                        isPrim[j] = false;

            int count = 0;
            for (int i = 2; i < n; i++)
                if (isPrim[i]) count++;

            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
