package com.CodeWithAbhi;


import javafx.util.Pair;


import static com.CodeWithAbhi.Solution.averageMarks;


public class Demo {

    public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
        // Write your code here.

        int total = m1 + m2 + m3;
        // Find the average.
        int average = total / 3;

        return new Pair(firstLetterOfName, average);
    }

        public static void main(String[] args){

            averageMarks('K',10,60,9);

            System.out.println("13"+5+3);
            String s1 =new String( "yes");
            String s2 = new String( "yes");
            String s3 = s1;
            s3= String.valueOf(s1==s2);
            System.out.println(s3);
        }
    }

//public class Demo {
//
//    public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
//
//        // Find the total marks.
//        int total = m1 + m2 + m3;
//        // Find the average.
//        int average = total / 3;
//
//        return new Pair(firstLetterOfName, average);
//
//    }
//}
