package com.erkuai.dailyalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.冒泡排序
        /**
         * 比较相邻元素;循环n-1次，两两比较
         */
        int[] numbers = new int[]{3, 2, 1, 4, 8, 0, 6};
        int[] bubbleSort = bubbleSort(numbers);
        //Log.i("algorithm", Arrays.toString(bubbleSort));

        //2.快速排序
        /**
         *
         */
        //3.选择排序
        /**
         *
         */
    }

    private int[] bubbleSort(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
