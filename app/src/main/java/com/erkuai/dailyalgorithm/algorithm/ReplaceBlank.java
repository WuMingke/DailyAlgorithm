package com.erkuai.dailyalgorithm.algorithm;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 将一个字符串中的空格替换成"%20"
 */

public class ReplaceBlank {

    /**
     * 使用StringBuffer
     */
    public static String replaceBlank1(String str) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(String.valueOf(str.charAt(i)));
            }
        }
        return new String(stringBuffer);
    }

    /**
     * 使用StringBuilder
     */
    public static String replaceBlank2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }

    /**
     * 从后往前复制
     */
    public static String replaceBlank3(String str) {
        int blankNum = 0;
        int length = str.length();
        int newLength = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                blankNum++;
            }
        }
        //替换后的字符串长度
        newLength = length + 2 * blankNum;
        char[] newChars = new char[newLength];
        int index = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                newChars[index--] = '0';
                newChars[index--] = '2';
                newChars[index--] = '%';
            } else {
                newChars[index--] = str.charAt(i);
            }
        }
        return new String(newChars);
    }

}
