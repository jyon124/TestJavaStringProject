package com.sept.javastringproject;

// Count all the vowels in a sentence and display the count
public class Vowels {
	
	public static int countAllVowels(String s) {
		int count = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || 
			   s.charAt(i) == 'i' ||
			   s.charAt(i) == 'u' || 
			   s.charAt(i) == 'e' || 
			   s.charAt(i) == 'o') {
				count+= 1;
			}
		}
		return count;
	}
}
