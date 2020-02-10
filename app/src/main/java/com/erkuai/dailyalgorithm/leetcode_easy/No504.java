package com.erkuai.dailyalgorithm.leetcode_easy;

public class No504 {

    //给定一个整数，将其转化为7进制，并以字符串形式输出。
//
// 示例 1:
//
//
//输入: 100
//输出: "202"
//
//
// 示例 2:
//
//
//输入: -7
//输出: "-10"
//
//
// 注意: 输入范围是 [-1e7, 1e7] 。
//


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public String convertToBase7(int num) {
            String ans = "";
            if (num < 0) {
                num = 0 - num;
                ans = ans + "-";
            }
            StringBuilder stringBuilder = new StringBuilder();
            do {
                int mod = num % 7;
                //ASC码48就是'0'，也就是说'0'的值是48，而后依次是'1'到'9'。 这样正好是char型减去48就是它对应的int值。
                stringBuilder.append((char) ('0' + mod));
                num = num / 7;
            } while (num > 0);
            ans = ans + stringBuilder.reverse().toString();
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.convertToBase7(100);
        System.out.println(s);

    }
//leetcode submit region end(Prohibit modification and deletion)

}
