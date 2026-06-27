package com.CodeWithAbhi.Arrays_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Write a Java program to remove a specific element from an array
 */
public class Array_Remove_Element {
    public static int[] removeElement(int arr[], int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();


//        int len = arr.length;
//        int i = 0;
//        int[] remove = new int[arr.length - 1];
////        if (arr == null || index < 0 || index >= arr.length)
//            while (i < len) {
//                if (arr[i] == index) {
//
//                    remove[i] = arr[i+1];
//                } else
//                    arr[i] += i;
//            }
//        return remove[arr[i]];
    }

    public static void main(String[] args) {

        int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Remove a specific element from an array:" + removeElement(arr, 3));

        System.out.println("Resultant Array: " + Arrays.toString(arr));

    }
}
