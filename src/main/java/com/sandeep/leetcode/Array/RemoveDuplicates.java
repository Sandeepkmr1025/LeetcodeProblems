package com.sandeep.leetcode.Array;

import java.util.Arrays;

class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = removeDuplicates(new int[]{1, 1, 2});
        Arrays.stream(numbers).forEach(System.out::println);

    }
    public static int[] removeDuplicates(int[] nums) {
        int rd = 0;
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp[rd] != nums[i]) {
                temp[++rd] = nums[i];
            }
        }
        return temp;
    }
}
