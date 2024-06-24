package com.ryuri.leetcode.easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder result = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            char digito = number.charAt(i);
            result.append(Character.toString(digito));
        }
        return number.contentEquals(result);
    }
}