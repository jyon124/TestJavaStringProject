package com.sept.javastringproject;
//  Count all consonants in a String and display the count
//  Replace all consonants with '*' in a String

public class Consonants {	
	public static int countConsonants(String s) {
		int count = 0;
		s = s.trim();
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' &&
			   s.charAt(i) != 'a' &&
			   s.charAt(i) != 'i' &&
			   s.charAt(i) != 'u' &&
			   s.charAt(i) != 'e' &&
			   s.charAt(i) != 'o') {
				count+= 1;
				s = s.substring(0, i) 
			              + "*" 
			              + s.substring(i + 1);
			}
		}
		System.out.println(s);
		return count;	
	}
}
