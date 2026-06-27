package com.CodeWithAbhi;
import java.util.Scanner;

public class DemoMatrixRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();


        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();
//
        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    private static boolean rotateMatrix(double[][] matrix, int mode) {
        if (mode == 1) {
            rotate90(matrix);

        } else if (mode == 2) {
//            rotate180(matrix);

        } else if (mode == 3) {
//            rotate270(matrix);

        }else {
            System.out.println();
        }

        return true;
    }




    public static void printMatrixToConsole(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                matrix[i][j] = (i + 0.1 * j)/**(j)*/;

                System.out.print((matrix[i][j]) + " ");
            }

            System.out.println();
        }

    }


    private static double[][] generateMatrix(int size) {

        return new double[size][size];

    }

    public static void rotate90(double[][] matrix) {
        int n = matrix.length;
//        transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
//                System.out.print(temp + " ");
            }
//            System.out.println();
        }
//        reverse
        for (int i=0;i<n;i++){
            int left = 0;
            int right = matrix[i].length-1;
            while (left<right){
                double temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");

    }

//    public static void rotate180(double[][] matrix) {
//
//        int n = matrix.length;
////        transpose
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//
//                double temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
////                System.out.print(temp + " ");
//            }
////            System.out.println();
//        }
////        reverse
//        for (int i=0;i<n;i++){
//            int left = 0;
//            int right = matrix[i].length-1;
//            while (left<right){
//                double temp = matrix[i][left];
//                matrix[i][left]=matrix[i][right];
//                matrix[i][right]=temp;
//                left++;
//                right--;
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++)
//                System.out.print(" " + matrix[i][j]);
//
//            System.out.print("\n");
//        }
//        System.out.print("\n");
//
//    }

   /* public static void rotate270(double[][] matrix) {

        int n = matrix.length;
//        transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        reverse
        for (int i=0;i<n;i++){
            int left = 0;
            int right = matrix[i].length-1;
            while (left<right){
                double temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }*/

}