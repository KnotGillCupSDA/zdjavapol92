package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

	@Test
	void shouldBeVerifiedAsPalindrome() {
		//given
		String palindrome = "sedes";

		//when
		boolean actual = PalindromeChecker.isPalindrome(palindrome);

		//then
		assertTrue(actual);
	}
}