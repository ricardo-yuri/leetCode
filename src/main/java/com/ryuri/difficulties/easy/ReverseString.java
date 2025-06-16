package com.ryuri.difficulties.easy;

import java.util.ArrayList;

public class ReverseString {

    private ReverseString(){}

    public static void reverseString(char[] s) {

        ArrayList lista = new ArrayList();

        for(int i = s.length - 1; i >= 0; --i){
            lista.add(s[i]);
        }

        System.out.println(lista);
    }
}
