package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class No401 {

    public static void main(String[] args) {
        List<String> strings = Solution.readBinaryWatch(8);
        System.out.println(strings);
    }

    //二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
//
// 每个 LED 代表一个 0 或 1，最低位在右侧。
//
//
//
// 例如，上面的二进制手表读取 “3:25”。
//
// 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
//
// 案例:
//
//
//输入: n = 1
//返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
//
//
//
// 注意事项:
//
//
// 输出的顺序没有要求。
// 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
// 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
//
// Related Topics 位运算 回溯算法


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {

        // //要计算所有的可能性,可以将小时和分钟的所有可能做循环,然后将当前点数的二进制值相加看有几个1,如果符合num,则对应输出时间

        public static List<String> readBinaryWatch(int num) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 60; j++) {
                    if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                        list.add(String.format("%d:%02d", i, j));
                    }
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
