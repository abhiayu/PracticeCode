package com.CodeWithAbhi;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxCount {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result_test.miniMaxSum(arr);

        bufferedReader.close();
    }

    public static class Result_test {
        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
//            Collections.sort(arr);
//            long min = 0;
//            long max = 0;
//            int count = 0;
//            int len = arr.size();
//            do{
//                min +=arr.get(count);
//                max += arr.get(len-1);
//                count++;
//                len--;
//            }
//            while(count < 4);
//            System.out.println(min + " " + max);


            long min = (long) Integer.MAX_VALUE, max = (long)Integer.MIN_VALUE;
            long currSum = 0;
            for (int j : arr) {
                currSum += j;
                if (j < min) {
                    min = j;
                }
                if (j > max) {
                    max = j;
                }
            }
            System.out.println((currSum-max) + " " + (currSum - min));

        }
    }
}