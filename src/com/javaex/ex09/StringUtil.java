package com.javaex.ex09;

public class StringUtil {
    public static String concatString(String[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
