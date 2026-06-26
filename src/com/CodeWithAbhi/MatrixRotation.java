package com.CodeWithAbhi;

import java.util.Scanner;

public class MatrixRotation {

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
        switch (mode) {
            case 1:
                rotate90(matrix);
                displayMatrix(matrix);
                break;
            case 2:
                rotate180(matrix);
//                displayMatrix(matrix);
                break;

            case 3:
                rotate270(matrix);
//                displayMatrix(matrix);
                break;
            default:
                System.out.println("you have choose wrong no.");
        }
        return false;
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }


    private static void printMatrixToConsole(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i + 0.1 * j)/**(j)*/;

                System.out.print((matrix[i][j]) + " ");
            }

            System.out.println();
        }


    }
//    0.0 0.1 0.2 0.3 0.4
//            1.0 1.1 1.2 1.3 1.4
//            2.0 2.1 2.2 2.3 2.4
//            3.0 3.1 3.2 3.3 3.4
//            4.0 4.1 4.2 4.3 4.4

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
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = matrix[i].length*2 - 1;
            while (left < right) {
                double temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }


    }

    public static void rotate180(double[][] matrix) {

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
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                double temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static double[][] rotate270(double[][] matrix) {

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
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                double temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;

    }

}