package com.sandeep.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

class DuplicateContainsSlidingWindow {
	
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
	}
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
    	 Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             if (map.containsKey(nums[i])) {
                 if (i - map.get(nums[i]) <= k) {
                     return true;
                 }
             }
             map.put(nums[i], i);
         }
         return false;
    }
}