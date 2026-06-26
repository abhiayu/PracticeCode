package com.CodeWithAbhi;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");
        int n = sc.nextInt();

//	    <write your code here>
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
    }

        int max = findMaxIntInArray(array);


        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(array));
        System.out.println("*** Max number in array ***");
        System.out.println(max);
    }


    public static int findMaxIntInArray(int[] intArray) {
        int i;
        int max = intArray[0];
//        max = intArray;
        for (i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        return max;
    }
}
