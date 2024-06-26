package com.sandeep.leetcode.Array;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chArr1 = s.toCharArray();
        char[] chArr2 = t.toCharArray();

        if (chArr1.length != chArr2.length)
            return false;

        int[] test = new int[256];

        for (char ch : chArr1) {
            test[ch]++;
        }

        for (char ch : chArr2) {
            test[ch]--;
        }

        for (int n : test) {
            if (n != 0)
                return false;
        }
        return true;
    }
}
