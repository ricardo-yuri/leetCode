package com.ryuri.leetcode.easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if(s.trim().contains(" ")) {
            return s.trim().substring(s.trim().lastIndexOf(" ")).trim().length();
        }
        return s.trim().length();
    }
}
