package com.ryuri.easy;

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
}