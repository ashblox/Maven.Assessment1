package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        ArrayList<String> allSubstrings = findAllSubstrings(input);
        for (int i = 0; i < allSubstrings.size(); i++) {
            if (isPalindromic(allSubstrings.get(i))) {
                count ++;
            }
        }
        return count;
    }

    public ArrayList<String> findAllSubstringsStartingAtN (String input, int n){
        ArrayList<String> allSubstringsStartingatN = new ArrayList<>();
        for (int i = n + 1; i <= input.length(); i++) {
            allSubstringsStartingatN.add(input.substring(n, i));
        }
        return allSubstringsStartingatN;
    }

    public ArrayList<String> findAllSubstrings (String input) {
        ArrayList<String> allSubstrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            allSubstrings.addAll(findAllSubstringsStartingAtN(input, i));
        }
        return allSubstrings;
    }

    public boolean isPalindromic (String str) {
        boolean isPalindrome = false;
        if (str.equals(BasicStringUtils.reverse(str))) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
