package com.CodeWithAbhi.Arrays_Practice;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array
 */
public class Array_Sum {
    public static void main(String[] args) {
        int arr_sum[] = {9,8,3,5,1,2,7,4,6};
        int sum = 0;
        Arrays.sort(arr_sum);
        for (int i : arr_sum)
            sum += i;
        System.out.println("sum values of an array is: "+sum);
    }

}
