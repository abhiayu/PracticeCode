//Every line of input will contain a String followed by an integer.
//Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from 0 to 999 .

//Output Format
//
//In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly  characters.
//The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits
// , you must pad your output's leading digits with zeroes.

package com.CodeWithAbhi;

import java.util.Scanner;

public class Trailing_whitespace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
        sc.close();
    }

}
//Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer
// is the 16th character, and each integer that was less than  digits now has leading zeroes.