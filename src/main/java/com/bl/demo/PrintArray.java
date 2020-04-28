package com.bl.demo;

public class PrintArray {
    public static <T> String arrayPrint(T[] t) {
        String result = "";
        for (T i : t)
            result = result + i + " ";
        return result;
    }

    public static Integer maximum(Integer[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < array[i-1])
                max = array[i-1];
        }
        return max;
    }
}
