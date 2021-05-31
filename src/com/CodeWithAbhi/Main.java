package com.CodeWithAbhi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        float num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num1:");
        num1 = scan.nextFloat();
        System.out.println("Enter the num2:");
//        Scanner scan1 = new Scanner(System.in);
        num2 = scan.nextFloat();

        String option = "Enter 0 for addtion, 1 for substraction, 2 for Multiplication" +
                ", 3 for division";

        System.out.println(option);
        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding these number");
                System.out.print("The result is: ");
                System.out.println(num1 + num2);
                break;
            case 1:
                System.out.println("subtracting these number");
                System.out.print("The result is: ");
                System.out.println(num1 - num2);
                break;
            case 2:
                System.out.println("Multiplying these number");
                System.out.print("The result is: ");
                System.out.println(num1 * num2);
                break;
            case 3:
                System.out.println("Dividing these number");
                System.out.print("The result is: ");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Not selected right option");
        }
    }
}
