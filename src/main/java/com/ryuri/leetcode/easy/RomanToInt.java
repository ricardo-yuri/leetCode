package com.ryuri.leetcode.easy;

import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {
        Map<Character, Integer> hashMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );


        this.percorreString(s, hashMap);

        return 1;
    }

    private void percorreString(String s, Map<Character, Integer> hashMap) {
        for (int i = 0; i < s.length(); i++) {
            int result = hashMap.get(String.valueOf(s.charAt(i)));
            for (int j = i++; j < s.length() - 1; j++) {
                int result2 = hashMap.get(String.valueOf(s.charAt(i)));
            }
        }

    }
}
