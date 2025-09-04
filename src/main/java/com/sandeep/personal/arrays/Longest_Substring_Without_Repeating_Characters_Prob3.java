package com.sandeep.personal.arrays;

public class Longest_Substring_Without_Repeating_Characters_Prob3 {

    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int curr_size;
        int max_size = 0;
        int[] hash = new int[256];
        for (int i = 0; i < 255; i++) {
            hash[i] = -1;
        }

        while (right < s.length()) {
            if (hash[s.charAt(right)] != -1) {
                if (hash[s.charAt(right)] >= left) {
                    left = hash[s.charAt(right)] + 1;
                }
            }
            curr_size = right - left + 1;
            max_size = Math.max(max_size, curr_size);
            hash[s.charAt(right)] = right;
            right++;
        }
        return max_size;
    }
}
