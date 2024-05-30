package com.sandeep.personal.arrays;

import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("start time: " + startTime);
        int[] arr = { 1, 3, 4, 7, 9, 6 };
        Arrays.sort(arr);

        for (int ele : arr) {
            Map<Integer, List<List<Integer>>> map = findPairs(arr, ele);
            if(!map.isEmpty())
            {
                System.out.println(map);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("end time: " + endTime);
        System.out.println("Time taken: " + (endTime - startTime));
    }

    private static Map<Integer, List<List<Integer>>> findPairs(int[] arr, int ele) {
        List<List<Integer>> listOfPairs = new ArrayList<>();
        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == ele) {
                List<Integer> list = new LinkedList<>();
                list.add(start);
                list.add(end);
                listOfPairs.add(list);
                map.put(ele, listOfPairs);
                start++;
                end--;
            } else if (sum < ele) {
                start++;
            } else {
                end--;
            }
        }
        return map;
    }
}
