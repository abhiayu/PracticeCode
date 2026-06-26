package com.CodeWithAbhi;

import javafx.util.Pair;

import java.util.Scanner;

public class Solution {

    public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
        // Write your code here.
        int avgMarks;
//        firstLetterOfName = 'K';
//        m1 = 10;
//        m2 = 6;
//        m3 = 9;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first character:");
        firstLetterOfName = scan.next().charAt(0);
        System.out.print("");
        m1 = scan.nextInt();
        System.out.print(" ");
        m2 = scan.nextInt();
        System.out.print(" ");
        m3 = scan.nextInt();



        avgMarks = (m1 + m2 + m3) / 3;
        System.out.print("Output is: "+firstLetterOfName+"   "+avgMarks);

        return null;
    }
    public static void main(String[] args){

        averageMarks('A',1,1,1);
    }
}
