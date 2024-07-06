package com.sandeep.leetcode.Array;

public class MaximumAverageSubArraySlidingWindow {

    public static void main(String[] args) {
        System.out.println("Maximum average subarray: "+findMaxAverage(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int subSum = 0;
        for (int i = 0; i < k; i++) {
            subSum += nums[i];
        }
        int maxSubSum = subSum;
        for (int i = k; i < nums.length; i++) {
            subSum = subSum + nums[i] - nums[i - k];
            maxSubSum = subSum > maxSubSum ? subSum : maxSubSum;
        }
        return (double) maxSubSum / k;

    }
}
