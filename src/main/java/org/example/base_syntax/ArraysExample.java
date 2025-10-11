package org.example.base_syntax;

public class ArraysExample {
    public static void main(String[] args) {
        String[] array = new String[4];

        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        array[3] = "D";

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }

        int[] intArray = new int[4];
        intArray[0] = 100;
        intArray[1] = 200;
        intArray[2] = 300;
        intArray[3] = 400;

        int min = intArray[0]; // 100
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        System.out.println("min element: " + min);
    }
}
