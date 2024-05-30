package com.sandeep.leetcode.Array;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwoSum {

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        List<List<Integer>> result = ts.twoSum(new int[]{3, 2, 4}, 6);
        result.forEach(System.out::println);
    }


    public List<List<Integer>> twoSum(int[] nums, int target) {

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }

        Map<Integer, Integer> map = IntStream.range(0, nums.length).boxed()
                .collect(Collectors.toMap(i->nums[i], Function.identity()));
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                List<Integer> list = new ArrayList<>();
                list.add(map.get(nums[start]));
                list.add(map.get(nums[end]));
                res.add(list);
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }
}