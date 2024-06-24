package com.sandeep.leetcode.Array;

class FindIndexOfFirstOccurrenceOfString {

    public static void main(String[] args) {
        int result = strStr("mississippi", "issip");
        System.out.println(result);// 4
    }
    public static int strStr(String haystack, String needle) {

        char[] chArr1 = haystack.toCharArray();
        char[] chArr2 = needle.toCharArray();

        int j = 0;
        for (int i = 0; i < chArr1.length; i++) {
            if (chArr2[j] == chArr1[i]) {
                if (j == chArr2.length - 1) {
                    return i - chArr2.length + 1;
                } else
                    j++;
            } else
                j = 0;
        }
        return -1;


    }
}