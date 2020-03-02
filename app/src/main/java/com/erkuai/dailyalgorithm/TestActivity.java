package com.erkuai.dailyalgorithm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.Pools;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.erkuai.dailyalgorithm.algorithm.FindNumber;
import com.erkuai.dailyalgorithm.algorithm.PrintListReversing;
import com.erkuai.dailyalgorithm.algorithm.ReplaceBlank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by Administrator on 2019/8/3.
 */

public class TestActivity extends AppCompatActivity {


    //    private static final String TAG = "ALGORITHM";
    private static final String TAG = "life_test";

    private static Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };

    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT - 1, 4));

    @Override
    protected void onStart() {
        super.onStart();

//        Debug.startMethodTracing("");
//        Debug.stopMethodTracing();

//        TraceCompat.beginSection("");
//        TraceCompat.endSection();


        MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() {
            @Override
            public boolean queueIdle() {
                return false;
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        service.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.countDown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Log.i(TAG, "onStart()");


        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();


        Looper.prepare();
        Looper.loop();

        handler.post(new Runnable() {
            @Override
            public void run() {

            }
        });

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

    public void showAnotherActivity(View view) {
        startActivity(new Intent(this, Test2Activity.class));


    }
}
