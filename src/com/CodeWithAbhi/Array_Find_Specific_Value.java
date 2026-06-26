package com.CodeWithAbhi;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Array_Find_Specific_Value {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1234,1897,1758,1457,2021};
        System.out.println(contains(arr,2021));
        System.out.println(contains(arr,2134));

    }
}
