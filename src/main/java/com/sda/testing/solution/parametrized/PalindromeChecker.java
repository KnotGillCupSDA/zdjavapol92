package com.sda.testing.solution.parametrized;

public class PalindromeChecker {

	public static boolean isPalindrome(String word) {
		String sanitized = word.replaceAll(" ", "");
		return new StringBuilder(sanitized).reverse().toString().equals(sanitized);
	}
}
