package TestJAVAStringProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.sept.javastringproject.Consonants;
import com.sept.javastringproject.LastLetterCount;
import com.sept.javastringproject.Palindrome;
import com.sept.javastringproject.Vowels;
import com.sept.javastringproject.Words;

public class TestJAVAStringProject {
	
	@Test
	public void testVowels() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'countingAllVowels' method from 'Vowels' class:");
		int result = Vowels.countAllVowels("Counting Vowels from this sentence.");
		assertEquals(10, result);
		System.out.println("[Input] 'Counting Vowels from this sentence.'");
		System.out.println("[Expected] Integer 10");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: Vowels.countAllVowels(\"Counting Vowels from this sentence.\")");
	}
	
	@Test
	public void testWords() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'countWords' method from 'Words' class:");
		int result = Words.countWords("Counting Words from this sentence.");
		assertEquals(5, result);
		System.out.println("[Input] 'Counting Words from this sentence.'");
		System.out.println("[Expected] Integer 5");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: Vowels.countWords(\"Counting Words from this sentence.\")");
	}
	
	@Test
	public void testPalindrome() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'checkPalindrome' method from 'Palindrome' class:");
		boolean result = Palindrome.checkPalindrome("Level");
		assertEquals(true, result);
		System.out.println("[Input] 'Level'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: Palindrome.checkPalindrome(\"Level\")");
	}
	
	@Test
	public void testConsonants() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'countConsonants' method from 'Consonants' class:");
		int result = Consonants.countConsonants("Count all consonants in a string");
		assertEquals(18, result);
		System.out.println("[Input] 'Count all consonants in a string'");
		System.out.println("[Expected] Integer 18");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: Consonants.countConsonants(\"Count all consonants in a string\")");
	}
	
	@Test
	public void testLastLetterCount() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'countAllwords' method from 'LastLetterCount' class:");
		String result = LastLetterCount.countAllwords("Display the new sentence where words are switched.");
		assertEquals("S count: 1, Y count: 1", result);
		System.out.println("[Input] 'Display the new sentence where words are switched.'");
		System.out.println("[Expected] String S count: 1, Y count: 1");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: LastLetterCount.countAllwords(\"Display the new sentence where words are switched.\")");
	}
}
