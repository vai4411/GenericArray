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

    private static void arrayPrint(Character[] charArray) {
        for (char i : charArray)
            System.out.println(i);
    }

    private static void arrayPrint(Double[] doubleArray) {
        for (double i : doubleArray)
            System.out.println(i);
    }

    private static void arrayPrint(Integer[] intArray) {
        for (int i : intArray)
            System.out.println(i);
    }
}


