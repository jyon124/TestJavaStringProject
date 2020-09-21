package com.sept.javastringproject;
// Count all Words in a String and display the count.

public class Words {
	public static int countWords(String s) {
		String[] splitted = s.split("\\s+");
		return splitted.length;
	}
}
