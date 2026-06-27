package com.CodeWithAbhi;
//Todo: A Very Big Sum
//        You are given an array of integers of size . You need to print the sum of the elements in the array,
//        keeping in mind that some of those integers may be quite large.
//        Input Format
//        The first line of the input consists of an integer . The next line contains space-separated integers
//        contained in the array.
//        Output Format
//        Print a single value equal to the sum of the elements in the array.
//        Constraints
//        Sample Input
//        5
//        1000000001 1000000002 1000000003 1000000004 1000000005
//        Output
//        5000000015
//        Note:
//        The range of the 32-bit integer is .
//        When we add several integer values, the resulting sum might exceed the above range. You might need to
//        use long long int in C/C++ or long data type in Java to store such sums.

import java.io.*;

class Result1 {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(Long[] ar) {
        // Write your code here

        long avr=0;

        for(int i=0;i<ar.length;i++){
            avr = avr+ar[i];
        }
        return avr;
    }

}
public class Big_Sum_Array { public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    Long[] ar =new Long[arCount] ;

    for (int i = 0; i < arCount; i++) {
        long arItem = Long.parseLong(arTemp[i]);
        ar[i]=arItem;
    }

    long result = Result1.aVeryBigSum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
}
}
