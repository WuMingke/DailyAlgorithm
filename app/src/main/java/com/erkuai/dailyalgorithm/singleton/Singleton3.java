package com.erkuai.dailyalgorithm.singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 懒汉式：非线程安全
 */

public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 singleton3;

    public static Singleton3 getSingleton3() {
        if (null == singleton3) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

}
