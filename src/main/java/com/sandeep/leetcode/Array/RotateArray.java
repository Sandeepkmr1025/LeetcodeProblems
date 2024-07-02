package com.sandeep.leetcode.Array;

import java.util.Arrays;

class RotateArray {
	
	public static void main(String[] args) {
        RotateArray sol = new RotateArray();
		sol.rotate(new int[] {1, 2, 3 , 4, 5, 6, 7}, 3);
	}
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // Reverse the complete array
        swap(nums, 0, nums.length-1);

        /// Reverse the array from 0 to k-1
        swap(nums, 0, k-1);

        // Reverse the array from k to nums.length-1
        swap(nums, k, nums.length-1);
        
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}