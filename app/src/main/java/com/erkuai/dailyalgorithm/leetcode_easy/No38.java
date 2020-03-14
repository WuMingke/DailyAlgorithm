package com.erkuai.dailyalgorithm.leetcode_easy;

public class No38 {

    //报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//
//
// 1 被读作 "one 1" ("一个一") , 即 11。
//11 被读作 "two 1s" ("两个一"）, 即 21。
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
//
// 注意：整数顺序将表示为一个字符串。
//
//
//
// 示例 1:
//
// 输入: 1
//输出: "1"
//
//
// 示例 2:
//
// 输入: 4
//输出: "1211"
//
// Related Topics 字符串


    /**
     * 2
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            String s = "1";
            if (n == 1)
                return s;
            for (int i = 2; i <= n; i++) {
                StringBuilder str = new StringBuilder();
                char pre = s.charAt(0);     //取第一个字符作为初始判断
                int count = 1;
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) == pre)
                        count++;         //相等即增加改数字数量
                    else {
                        str.append(count).append(pre); //不相等的话字符串增加数字和个数
                        pre = s.charAt(j);       ////修改初始判断为不同的数字
                        count = 1;                //数目重新为1
                    }
                }
                str.append(count).append(pre);  //将最后重复的数字和数量添加
                s = str.toString();
            }
            return s;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
