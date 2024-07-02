package com.sandeep.leetcode.Array;

import java.util.logging.ConsoleHandler;

public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0) && (arr[i + 2] % 2 != 0))
                return true;
        }
        return false;
    }
}
