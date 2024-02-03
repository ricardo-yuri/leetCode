package com.ryuri.easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String result = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            char digito = number.charAt(i);
            result = result.concat(String.valueOf(digito));
        }
        return number.equals(result);
    }
}