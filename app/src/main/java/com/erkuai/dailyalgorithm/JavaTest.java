package com.erkuai.dailyalgorithm;

import android.graphics.Bitmap;
import android.util.LruCache;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class JavaTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> hashMap =
                new LinkedHashMap<>(0, 0.75f, true);



        hashMap.put("a", "A");
        hashMap.put("b", "B");
        hashMap.put("c", "C");
        hashMap.put("d", "D");

      //  hashMap.get("a");
      //  hashMap.put("e", "E");
      //  hashMap.get("e");

        Iterator<String> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        int maxMemory = (int) (Runtime.getRuntime().totalMemory() / 1024);
//        int cacheSize = 4;
//        LruCache<Integer, Integer> cache = new LruCache<>(cacheSize);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.put(3, 3);
//        cache.put(4, 4);
//
//        for (int i = 1; i <= cache.size(); i++) {
//            System.out.println(cache.get(i));
//        }


    }
}
