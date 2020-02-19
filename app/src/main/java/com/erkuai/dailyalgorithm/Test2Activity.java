package com.erkuai.dailyalgorithm;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class Test2Activity extends Activity {
    private static final String TAG = "Test2Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        OkHttpClient client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @org.jetbrains.annotations.Nullable
                    @Override
                    public Request authenticate(@org.jetbrains.annotations.Nullable Route route, @NotNull Response response) throws IOException {
                        return null;
                    }
                })
                .build();

        Request build = new Request.Builder()
                .url("https://api.github.com/users/rengwuxian/repos")
                .build();

        client.newCall(build).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.i(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String string = response.body().string();
                Log.i(TAG, "onResponse: " + string);
            }
        });
    }
}
