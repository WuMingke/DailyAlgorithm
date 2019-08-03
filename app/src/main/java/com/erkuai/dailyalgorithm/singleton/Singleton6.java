package com.erkuai.dailyalgorithm.singleton;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 懒汉式：静态内部类（推荐）
 */

public class Singleton6 {

    private Singleton6() {
    }

    private static class SingletonHolder {
        private static Singleton6 singleton6 = new Singleton6();
    }

    public static Singleton6 getSingleton6() {
        return SingletonHolder.singleton6;
    }
}
