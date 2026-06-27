package com.CodeWithAbhi.Arrays_Practice;

public class ArrayLargestElement {

    public static int findLargestNum(int[] arrayNum) {

        if (arrayNum == null || arrayNum.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int largest = arrayNum[0];

        for (int i = 1; i < arrayNum.length; i++) {

            if (arrayNum[i] > largest) {
                largest = arrayNum[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] myArray = {25, 14, 56, 15, 36, 56, 7, 18, 29, 49};

        System.out.println("Largest Number: " + findLargestNum(myArray));
    }
}