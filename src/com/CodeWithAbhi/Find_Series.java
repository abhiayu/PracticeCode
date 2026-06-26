package com.CodeWithAbhi;

import java.util.Scanner;

public class Find_Series {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2, j)*b;
                System.out.print(a +" ");
            }
            System.out.println();
        }
        in.close();
    }
}


/*
int sqr=0;
        int a=0;
for (i=1;i<n;i++){
            sqr=i*i;
            a=sqr+i+2;
        } System.out.println(a);*/