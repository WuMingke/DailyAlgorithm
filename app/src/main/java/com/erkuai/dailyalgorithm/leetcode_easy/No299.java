package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

public class No299 {

    //你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。
//
// 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 A 表示公牛，用 B 表示奶牛。
//
// 请注意秘密数字和朋友的猜测数都可能含有重复数字。
//
// 示例 1:
//
// 输入: secret = "1807", guess = "7810"
//
//输出: "1A3B"
//
//解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
//
// 示例 2:
//
// 输入: secret = "1123", guess = "0111"
//
//输出: "1A1B"
//
//解释: 朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。
//
// 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。
// Related Topics 哈希表



    /**
     * 2
     */

    /**
     * 用一个数组来存不对位的数字出现的次数
     * 0 1 2 3 4 5 6 7 8 9
     *   1   1     1
     */

    class Solution {
        public String getHint(String secret, String guess) {
            //只存在数字0-9
            int[] secretMap = new int[10];
            int countA = 0, countB = 0;
            for (int i = 0; i < secret.length(); i++) {
                if (guess.charAt(i) == secret.charAt(i)) {
                    countA++;
                } else {
                    secretMap[secret.charAt(i) - '0']++;
                }

            }
            for (int i = 0; i < secret.length(); i++) {

                if (guess.charAt(i) != secret.charAt(i) && secretMap[guess.charAt(i) - '0'] > 0) {
                    countB++;
                    secretMap[guess.charAt(i) - '0']--;
                }
            }
            return countA + "A" + countB + "B";

        }
    }

    public static void main(String[] args) {
        System.out.println(('7' - '0'));
    }
//leetcode submit region end(Prohibit modification and deletion)

}
