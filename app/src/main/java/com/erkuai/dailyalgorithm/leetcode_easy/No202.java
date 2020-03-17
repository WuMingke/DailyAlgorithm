package com.erkuai.dailyalgorithm.leetcode_easy;

public class No202 {

    //编写一个算法来判断一个数是不是“快乐数”。
//
// 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
//
// 示例:
//
// 输入: 19
//输出: true
//解释:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//
// Related Topics 哈希表 数学


    /**
     * 方法：使用“快慢指针”思想找出循环：
     * “快指针”每次走两步，“慢指针”每次走一步，当二者相等时，即为一个循环周期。
     * 此时，判断是不是因为1引起的循环，是的话就是快乐数，否则不是快乐数。
     *
     * 打印一下结果就知道了
     */

    /**
     * 2
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean isHappy(int n) {
            int slow = n, fast = n;
            do{
                slow = bitSquareSum(slow);
                fast = bitSquareSum(fast);
                fast = bitSquareSum(fast);
              //  System.out.println("slow = "+slow+"-----fast = "+fast);
            }while(slow != fast);

            return slow == 1;

        }

        int bitSquareSum(int n) {
            int sum = 0;
            while(n > 0) {
                int bit = n % 10;
                sum += bit * bit;
                n = n / 10;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(11));
    }
//leetcode submit region end(Prohibit modification and deletion)

}
