package com.CodeWithAbhi;

import java.util.*;

public class Print_next_line {

    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int value1:");
        int a = scan.nextInt();
        System.out.println("Enter int value2:");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter int value3:");
        int c = scan.nextInt();
        System.out.println("The values of "+a + "\n" + b + "\n" + c);


// Todo: Another example
        Scanner scan_new1 = new Scanner(System.in);
        System.out.println("Enter int value:");
        int i = scan_new1.nextInt();
        System.out.println("Enter double value:");
        Double d = scan_new1.nextDouble();
        scan_new1.nextLine();
        System.out.println("Enter int String:");
        String s = scan_new1.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
        scan_new1.close();



    }
}
