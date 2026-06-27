package com.CodeWithAbhi;

public class Pattrens {
    public static  void main(String[] args){

        int n=5;
        int i, j;

        for (i=n;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
