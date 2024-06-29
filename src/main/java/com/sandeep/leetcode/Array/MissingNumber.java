package com.sandeep.leetcode.Array;

class MissingNumber {

    public static void main(String[] args) {
        int[] temp = {0, 1, 2, 3};
        System.out.println(missingNumber(temp));
    }

    public static int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for (int n : nums) {
            sum1 += n;
        }

        for (int i = 1; i <= nums.length; i++) {
            sum2 += i;
        }
        return sum2 - sum1;
    }

}