package com.CodeWithAbhi;

import java.util.Scanner;

public class EmptyRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {

        for (int i=1; i<=height; i++){
            for(int k=1; k<=1-i+1; k++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=width; j++){
                {
                    if(i==1||i==height||j==1||j==width){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }


            }
            System.out.print("\n");
        }

//        int i = 0;
//        while (i < height) {
//            int j = 0;
//            while (j < width) {
//                if (i == 0 || i == height - 1 || j == 1 || j == width-1 ) {
//                    System.out.print("+");
//                } else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }

}
