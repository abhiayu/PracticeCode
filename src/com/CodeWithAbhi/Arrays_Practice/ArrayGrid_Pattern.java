package com.CodeWithAbhi.Arrays_Practice;

/**
 * Write a Java program to print the following grid.
 */
public class ArrayGrid_Pattern {
    public static void main(String[] args) {

        int arr[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
