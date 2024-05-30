package com.sandeep.leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {

        TwoSum2 twoSum = new TwoSum2();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 2, 4}, 6)));

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int rem = target - nums[i];
            if(map.containsKey(rem))
            {
                return new int[]{map.get(rem),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
