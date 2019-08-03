package com.erkuai.dailyalgorithm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.erkuai.dailyalgorithm.algorithm.FindNumber;
import com.erkuai.dailyalgorithm.algorithm.PrintListReversing;
import com.erkuai.dailyalgorithm.algorithm.ReplaceBlank;


/**
 * Created by Administrator on 2019/8/3.
 */

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "ALGORITHM";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // boolean b = FindNumber.find2(new int[][]{{1, 2, 3}, {1, 5, 6}}, 5);

       // String s = ReplaceBlank.replaceBlank3("123 33");
        //Log.i(TAG, s);


    }
}
