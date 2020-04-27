package com.bl.demo;

public class PrintArray {
    public static void main(String[] args) {
        Integer[] intArray= {1, 2, 3};
        Double[] doubleArray = {1.1, 1.2, 1.3};
        Character[] charArray = {'a', 'b', 'c'};
        arrayPrint(intArray);
        arrayPrint(doubleArray);
        arrayPrint(charArray);
    }

    public static<T> boolean arrayPrint(T[] t) {
        for (T i : t)
            System.out.println(i);
        return true;
    }
}


