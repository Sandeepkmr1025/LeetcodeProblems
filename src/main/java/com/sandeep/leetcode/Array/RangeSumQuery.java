package com.sandeep.leetcode.Array;

import java.util.Arrays;

public class RangeSumQuery {
    private int[] ps = null;

    public RangeSumQuery(int[] nums) {
        ps = new int[nums.length];
        ps[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? ps[right] : ps[right] - ps[left - 1];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        RangeSumQuery obj = new RangeSumQuery(nums);
        int param_1 = obj.sumRange(0,4);
        System.out.println(param_1);
    }

}
