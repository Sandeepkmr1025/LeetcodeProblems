package com.sandeep.leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4, 4};
        System.out.println(containsDuplicate1(temp));

    }

    public static boolean containsDuplicate1(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().anyMatch(v -> v > 1);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).filter(n -> !set.add(n)).count() > 0;
    }

    public boolean containsDuplicate4(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
