package com.erkuai.dailyalgorithm.leetcode_easy;

public class No788 {
    //我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。
//
// 如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；2 和 5 可以互相旋转成对方；6 和 9
// 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。
//
// 现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？
//
//
//示例:
//输入: 10
//输出: 4
//解释:
//在[1, 10]中有四个好数： 2, 5, 6, 9。
//注意 1 和 10 不是好数, 因为他们在旋转之后不变。
//
//
// 注意:
//
//
// N 的取值范围是 [1, 10000]。
//
// Related Topics 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rotatedDigits(int N) {
            // Count how many n in [1, N] are good.
            int ans = 0;
            for (int n = 1; n <= N; ++n)
                if (good(n, false)) ans++;
            return ans;
        }

        // Return true if n is good.
        // The flag is true iff we have an occurrence of 2, 5, 6, 9.
        public boolean good(int n, boolean flag) {
            if (n == 0) return flag;

            int d = n % 10;
            if (d == 3 || d == 4 || d == 7) return false;
            if (d == 0 || d == 1 || d == 8) return good(n / 10, flag);
            return good(n / 10, true);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
