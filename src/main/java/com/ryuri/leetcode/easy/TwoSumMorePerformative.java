package com.ryuri.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMorePerformative {

    public static int[] twoSum(int[] nums, int target) {
        var myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (myMap.containsValue(complement)) {
                int o1 = (int) myMap.entrySet().stream()
                        .filter(o -> o.getValue().equals(complement))
                        .findFirst()
                        .map(Map.Entry::getKey).get();
                return new int[]{o1, i};
            }
            myMap.put(i, nums[i]);
        }
        return null;
    }

}
