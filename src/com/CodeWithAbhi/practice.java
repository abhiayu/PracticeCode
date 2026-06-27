package com.CodeWithAbhi;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class practice {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                pos = pos + 1;
            } else if (arr[i] < 0) {
                neg = neg + 1;
            } else {
                zero = zero + 1;
            }
        }
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(pos / N));
        System.out.println(df.format(neg / N));
        System.out.println(df.format(zero / N));
    }

}
























//package com.CodeWithAbhi;
//
//
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.regex.*;
//
//public class practice  {
//
//    /*
//     * Complete the 'plusMinus' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static void plusMinus(List<Integer> arr) {
//        // Write your code here
//        int n = 6;
//        for (Integer integer : arr) {
//            {-4, 3, -9, 0, 4, 1}
//        }
//        float positive = 0;
//        float negative = 0;
//        float zero = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr.get(i) > 0) {
//                positive++;
//            }
//            else if (arr.get(i) < 0) {
//                negative++;
//            }
//            else if (arr.get(i) == 0) {
//                zero++;
//            }
//        }
//
//        double  nn;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrTemp[i]);
//            arr.add(arrItem);
//        }
//
//        practice.plusMinus(arr);
//
//        bufferedReader.close();
//    }
//}
//
