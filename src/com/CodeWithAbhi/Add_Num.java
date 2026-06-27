package com.CodeWithAbhi;


public class Add_Num {
    static int c=10;
    public static void main(String[] args) {
        int a = 5;
        final int b = 3;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) >>> 1;
        System.out.println(b);
    }
}
