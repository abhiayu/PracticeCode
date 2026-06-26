//Implement console program which will meet the following requirements:
//        Program starts and asks user to enter random words separated by space.
//        Program asks user to enter minimum length of string to filter words which were entered.
//        Program creates array object from entered words
//        Program calls specific method which takes String[] as a parameter and returns array of strings which contains
//        words that have length more or equal to value specified by user

package com.CodeWithAbhi;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minumum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }


    public static String[] filterWordsByLength(int minLength, String[] words) {
        for (int i = 0; i < minLength; i++) {
            if (words.length <=minLength ) {

            }
            System.out.println("String array length is: " + words.length);

            System.out.println("This pass the filter:" + words[i]);
        }
        return words;
    }
}

//        System.out.println("String array length is: " + minLength);
//
//        for (int i = 0; i < minLength; i++) {
//            System.out.println("This pass the filter:"+words[i]);
//        }
//        return words;
//    }

//		<write your code here>
//            final Pattern pattern = Pattern.compile("\"\\\\b\\\\w{0}\\\\b\"", Pattern.MULTILINE);
//
//            final Matcher matcher = pattern.matcher().toString();
//            for (String word : words) {
//                if (word.matches( pattern.matcher(word).toString())) {
//                    System.out.println("This pass the filter: " + matcher.group(0));
//                }
//            }
//            return words;



//            List<String> result = new ArrayList<>();

//            result.stream().filter(words);
//            return result;


//              result= List<words>

//            List<String> result = Arrays.stream(words).findFirst().filter(word -> word.length() > 5);
//            result.forEach());