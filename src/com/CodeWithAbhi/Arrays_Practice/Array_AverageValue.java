package com.CodeWithAbhi.Arrays_Practice;

/**
 * Write a Java program to calculate the average value of array elements
 */
public class Array_AverageValue {
    public static void main(String[] args) {

        int arr[] = {5, 2, 6, 3, 9, 9,-3,45,-25};
        int sum = 0;
        double avg = 0;
        for (int i : arr) {
            sum += i;
        }
        avg = sum / arr.length;
        System.out.println("Average value of array elements: " + avg);

    }
}
