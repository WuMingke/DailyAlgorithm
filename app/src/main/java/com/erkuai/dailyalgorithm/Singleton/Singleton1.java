package com.erkuai.dailyalgorithm.Singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 饿汉式：线程安全，耗费资源
 */

public class Singleton1 {

    private Singleton1() {
    }

    private static final Singleton1 SINGLETON_1 = new Singleton1();

    public static Singleton1 getSingleton1() {
        return SINGLETON_1;
    }
}
