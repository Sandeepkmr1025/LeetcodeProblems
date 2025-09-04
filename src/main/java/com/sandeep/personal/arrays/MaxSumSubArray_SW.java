package com.sandeep.personal.arrays;

public class MaxSumSubArray_SW {

    public static void main(String[] args) {
        int[] arr = {3,8,2,5,7,6,12};
        int k =4;

        int curr_sum = 0;

        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;

        for (int i = 1; i <= arr.length - k; i++) {
            curr_sum = curr_sum - arr[i - 1] + arr[i + k - 1];
            if (curr_sum > max_sum)
                max_sum = curr_sum;
        }
        System.out.println(max_sum);
    }
}
