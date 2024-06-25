package com.sandeep.leetcode.Array;

public class ValidPalindrome {
    public static void main(String[] args) {

        //String s = "A man, a plan, a canal: Panama";
        String s = "0P";
        char[] chArr = s.toCharArray();
        System.out.println(extracted(chArr));

    }

    private static boolean extracted(char[] chArr) {
        String s1 = "";
        for(char ch : chArr)
        {
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
            {
                s1 += ch;
            } else if (ch>='A' && ch<='Z') {
                s1 += (char)(ch+32);
            }
        }
        System.out.println(s1);
        int left=0;
        int right=s1.length()-1;
        while (left<right)
        {
            if(s1.charAt(left)!=s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
