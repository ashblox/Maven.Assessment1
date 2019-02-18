package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String camelCase = str.charAt(0) + "";
        camelCase = camelCase.toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            camelCase += str.charAt(i) + "";
        }
        return camelCase;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        StringBuilder strbuild = new StringBuilder(str);
        strbuild = strbuild.reverse();
        reverse = strbuild.toString();
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverseToCamel = reverse(str);
        reverseToCamel = camelCase(reverseToCamel);
        return reverseToCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String charsRemoved = "";
        for (int i = 1 ; i < str.length() - 1; i++) {
            charsRemoved += str.charAt(i) + "";
        }
        return charsRemoved;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String casingInverted = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                casingInverted += str.charAt(i);
            } else if (str.charAt(i) < 97) {
                String caseCorrected = str.charAt(i) + "";
                caseCorrected = caseCorrected.toLowerCase();
                casingInverted += caseCorrected;
            } else {
                String caseCorrected = str.charAt(i) + "";
                caseCorrected = caseCorrected.toUpperCase();
                casingInverted += caseCorrected;
            }
        }
        return casingInverted;
    }
}
