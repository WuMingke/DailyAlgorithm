package com.erkuai.dailyalgorithm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.erkuai.dailyalgorithm.algorithm.FindNumber;
import com.erkuai.dailyalgorithm.algorithm.PrintListReversing;
import com.erkuai.dailyalgorithm.algorithm.ReplaceBlank;


/**
 * Created by Administrator on 2019/8/3.
 */

public class TestActivity extends AppCompatActivity {

    //    private static final String TAG = "ALGORITHM";
    private static final String TAG = "life_test";

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // boolean b = FindNumber.find2(new int[][]{{1, 2, 3}, {1, 5, 6}}, 5);

        // String s = ReplaceBlank.replaceBlank3("123 33");
        //Log.i(TAG, s);

        Log.i(TAG, "onCreate()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow()");
    }

    public void showTestDialog(View view) {
        TestDialog testDialog = new TestDialog();
        testDialog.show(getFragmentManager(), "");
    }
}
