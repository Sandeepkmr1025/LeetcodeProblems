package com.sandeep.leetcode.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

class RemoveDuplicates2 {

    public static void main(String[] args) {

        int[] numbers = removeDuplicates(new int[]{1, 1, 2});
        Arrays.stream(numbers).forEach(System.out::println);
    }
    public static int[] removeDuplicates(int[] nums) {
        int rd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                nums[++rd] = nums[i];
            }
        }
        return IntStream.rangeClosed(0, rd).map(i -> nums[i]).toArray();
    }
}
