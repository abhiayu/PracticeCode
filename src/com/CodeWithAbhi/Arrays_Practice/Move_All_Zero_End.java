package com.CodeWithAbhi.Arrays_Practice;

import java.util.Arrays;

public class Move_All_Zero_End {

    public static void move_all_zero(int n, int arr[]){

        int count = 0;// Count of non-zero elements
        int i;
        int temp[] = arr.clone();
        int small = 0, large = n - 1;
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        Arrays.sort(arr); // for sorting

        for (i=0;i<n;i++)
            if (arr[i]!=0)
                arr[count++] = arr[i];// here count incremented




                // Now all non-zero elements have been shifted to
                // front and 'count' is set as index of first 0.
                // Make all elements 0 from count to end.
                while(count<n)
                    arr[count++]=0;



//        arr[i] = temp[small++];


    }
    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        move_all_zero(n,arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
