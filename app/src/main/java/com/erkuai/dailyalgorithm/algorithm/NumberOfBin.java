package com.erkuai.dailyalgorithm.algorithm;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */

public class NumberOfBin {

    //把一个整数减去１再和原整数与，就会把整数最右边一个１变成０
    public static int numberOfBin(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
