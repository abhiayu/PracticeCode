package com.CodeWithAbhi;

public class Multiple_pattern {
    public static void main(String[] args) {
        int i;
        int j,n=6;

        for (i=0;i<4;i++){
            for (j=0;j<(i-1);j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}


