package com.erkuai.dailyalgorithm.paper;

import java.util.Arrays;

public class Money {
    // 动态规划 最少零钱数
    // 有1，3，7三个面值的金钱，现在要取n元。怎么取个数最少。

    private static int money(int[] money, int sum) {
        int[] count = new int[sum + 1];
        count[0] = 0;
        for (int j = 1; j < sum + 1; j++) { //总金额数，1,2,3，……，sum
            int minCoins = j;
            for (int i = 0; i < money.length; i++) {    //遍历硬币的面值
                if (j - money[i] >= 0) {
                    int temp = count[j - money[i]] + 1; //当前所需硬币数
                    if (temp < minCoins) {
                        minCoins = temp;
                    }
                }
            }
            count[j] = minCoins;
        }
        System.out.println(Arrays.toString(count));
        return count[sum];
    }

    public static void main(String[] args) {
        int[] money = {1, 3, 7};
        int sum = 8;
        int count = money(money, sum);
        System.out.println(count);
    }
}
