package com.erkuai.dailyalgorithm.singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 饿汉式：在静态代码块中实现
 */

public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getSingleton2() {
        return singleton2;
    }

}
