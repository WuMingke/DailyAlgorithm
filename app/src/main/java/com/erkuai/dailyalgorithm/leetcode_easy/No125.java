package com.erkuai.dailyalgorithm.leetcode_easy;

public class No125 {

    //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。
//
// 示例 1:
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
//
//
// 示例 2:
//
// 输入: "race a car"
//输出: false
//
// Related Topics 双指针 字符串

    /**
     * 2
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean isPalindrome(String s) {
            char[] cArrs = s.toCharArray();
            for (int i = 0, j = cArrs.length - 1; i < j; i++, j--) {
                char temp;
                //判断是否为字符和数字
                boolean flag1 = (cArrs[i] >= '0' && cArrs[i] <= '9') ||
                        (cArrs[i] >= 'a' && cArrs[i] <= 'z') ||
                        (cArrs[i] >= 'A' && cArrs[i] <= 'Z');
                boolean flag2 = (cArrs[j] >= '0' && cArrs[j] <= '9') ||
                        (cArrs[j] >= 'a' && cArrs[j] <= 'z') ||
                        (cArrs[j] >= 'A' && cArrs[j] <= 'Z');
                //没有交换标点
                //前面是往中间移动了，如果其中一个是标点的话，另一个要回退，重新进行下一次比较
                if (!flag1 && flag2) j++;
                if (flag1 && !flag2) i--;
                //交换
                if (flag1 && flag2) {
                    temp = cArrs[j];
                    cArrs[j] = cArrs[i];
                    cArrs[i] = temp;
                }
            }

            return s.equalsIgnoreCase(String.valueOf(cArrs));

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
//leetcode submit region end(Prohibit modification and deletion)

}
