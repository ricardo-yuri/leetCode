package com.ryuri.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("nums[i] " + nums[i] + " nums[j] " + nums[j]);
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] listIntOne = new int[4]; // 2,7,11,15
        int[] listIntTwo = new int[3]; //3,2,4
        int[] listIntThree = new int[2]; // 3,3

        listIntOne[0] = 2;
        listIntOne[1] = 7;
        listIntOne[2] = 11;
        listIntOne[3] = 15;

        listIntTwo[0] = 3;
        listIntTwo[1] = 2;
        listIntTwo[2] = 4;

        listIntThree[0] = 3;
        listIntThree[1] = 3;

        System.out.println("Indice do primeiro array " + Arrays.toString(twoSum(listIntOne, 9)));
        System.out.println("Indice do segundo array " + Arrays.toString(twoSum(listIntTwo, 6)));
        System.out.println("Indice do terceiro array " + Arrays.toString(twoSum(listIntThree, 6)));
    }
}