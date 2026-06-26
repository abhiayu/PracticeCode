package com.CodeWithAbhi;

import java.util.*;

public class Count_variable {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner string_scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = string_scan.next();
        int count = 0;
        String c = String.valueOf(b.length());
        System.out.println("myString is: " + c);

        while (a != 0) {
            a = a / 10;
            count++;
        }
        System.out.println("myInt is:" + count);
        // Complete this line
        // Complete this line


        // Complete this line
        // Complete this line
    }
}
