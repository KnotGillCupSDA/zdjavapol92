package com.sda.testing.solution.parametrized;

public class PalindromeChecker {

	public static boolean isPalindrome(String word) {
		return new StringBuilder(word).reverse().toString().equals(word);
	}
}
