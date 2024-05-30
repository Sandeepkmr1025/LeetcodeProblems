package com.sandeep.personal.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("start time: " + startTime);
        int[] arr = { 1, 3, 4, 7, 9, 6 };

        for (int ele : arr) {
            Map<Integer, List<List<Integer>>> map = findPairs(arr, ele);
            if(!map.isEmpty())
            {
                System.out.println(map);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("end time: " + startTime);
        System.out.println("Total time taken : "+ (endTime - startTime));
    }

    private static Map<Integer, List<List<Integer>>> findPairs(int[] arr, int ele) {
        List<List<Integer>> listOfPairs = new ArrayList<>();
        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == ele) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    listOfPairs.add(list);
                    map.put(ele, listOfPairs);
                }
            }
        }
        return map;
    }
}
