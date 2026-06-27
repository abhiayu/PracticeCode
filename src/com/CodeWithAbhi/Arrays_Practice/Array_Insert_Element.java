package com.CodeWithAbhi.Arrays_Practice;

import java.util.Arrays;

/**
 * Write a Java program to insert an element (specific position) into an array
 */
public class Array_Insert_Element {

    public static int InsertELement(int arr[],int index, int element){

        for(int i=arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        return arr[index] = element;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int index = 2;
        int element = 8;
        System.out.println("Original Array : "+ Arrays.toString(arr));
        InsertELement(arr,index,element);
        System.out.println("New Array: "+Arrays.toString(arr));
    }
}
