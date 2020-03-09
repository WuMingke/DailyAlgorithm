package com.erkuai.dailyalgorithm.interview;

public class No50 {
    //实现 pow(x, n) ，即计算 x 的 n 次幂函数。
//
// 示例 1:
//
// 输入: 2.00000, 10
//输出: 1024.00000
//
//
// 示例 2:
//
// 输入: 2.10000, 3
//输出: 9.26100
//
//
// 示例 3:
//
// 输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25
//
// 说明:
//
//
// -100.0 < x < 100.0
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
//
// Related Topics 数学 二分查找


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        /**
         * 递归模版：
         * 
         * 参数：首先参数会给一个层数level，相当于盗梦空间的第几层梦境
         * 代码：首先是终止条件
         * 其次是业务逻辑，完成这一层梦境要做的事情
         * 第三是进入下一层梦境 level+1，调用函数本身，这时这层业务已经完成
         * （收尾工作，按照实际情况分析，或有或无）
         */

        private double fastPow(double x, long n) {
            if (n == 0) {
                return 1.0;
            }
            double half = fastPow(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }

        public double myPow(double x, int n) {

            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }

            return fastPow(x, N);


            // 非递归
//            long N = n;
//            if (N < 0) {
//                x = 1 / x;
//                N = -N;
//            }
//            double ans = 1;
//            for (long i = 0; i < N; i++)
//                ans = ans * x;
//            return ans;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
