package com.erkuai.dailyalgorithm.paper;

import android.view.View;
import android.view.ViewGroup;

public class GetViewCount {

    // 获取ViewGroup里的view数量

    /**
     * 2
     */

    public int getCount(ViewGroup viewGroup) {

        int count = viewGroup.getChildCount();

        //循环获取子View
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                //如果子View是ViewGroup，则用递归获取子View数量
                int childCount = getCount((ViewGroup) child);
                count += childCount;
            } else {
                count++;
            }
        }

        return count;
    }
}
