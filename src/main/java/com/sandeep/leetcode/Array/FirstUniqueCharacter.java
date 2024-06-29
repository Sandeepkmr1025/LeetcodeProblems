package com.sandeep.leetcode.Array;

class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
	}

	public static int firstUniqChar(String s) {

		int[] tempArr = new int[256];
		char[] charArray = s.toCharArray();
		
		for (char ch : charArray) {
			tempArr[ch]++;
		}

		for (int i = 0; i < charArray.length; i++) {
			if (tempArr[charArray[i]] == 1) {
				return i;
			}
		}

		return -1;

	}
}