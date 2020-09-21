package com.sept.javastringproject;
// Reverse a String and check if string in Palindrome.
// example input) tenet, level, pure

public class Palindrome {	
	public static boolean checkPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		s = s.toLowerCase();
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
}
