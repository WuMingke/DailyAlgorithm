package com.erkuai.dailyalgorithm.singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 懒汉式：线程安全，给方法加锁
 */

public class Singleton4 {

    private Singleton4() {
    }

    private static Singleton4 singleton4;

    public synchronized static Singleton4 getSingleton4() {
        if (null == singleton4) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}
