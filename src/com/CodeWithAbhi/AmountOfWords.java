package com.CodeWithAbhi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AmountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String Words = sc.nextLine();
        String amountOfWords = String.valueOf(getWordsAmount(Words));
//        String amountOfWords = "One two       three\n four\tfive ";


        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    public static int getWordsAmount(String  text) {

//        String[] words = text.split("\\s+");
//        return words.length;
        StringTokenizer tokens = new StringTokenizer(text);

        // Return the number of words
        // in the given string using
        // countTokens() method
        return tokens.countTokens();

    }
}