package com.erkuai.dailyalgorithm.Singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 懒汉式：线程安全，双重检查锁（同步代码块）
 */

public class Singleton5 {

    private Singleton5() {
    }

    private static Singleton5 singleton5;

    public static Singleton5 getSingleton5() {
        if (null == singleton5) {
            synchronized (Singleton5.class) {
                if (null == singleton5) {
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }

}
