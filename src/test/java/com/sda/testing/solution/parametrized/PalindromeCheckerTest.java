package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeCheckerTest {

	@ParameterizedTest
	//@ValueSource(strings = {"sedes","kajak"} )
	@CsvSource({"sedes, true","kajak, true", "costam, false"})
	void shouldVerifyWords(String word, boolean expected) {
		//when
		boolean actual = PalindromeChecker.isPalindrome(word);

		//then
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/testdata/palindrome.csv")
	void shouldVerifyWordsFromExternalFile(String word, boolean expected) {
		//when
		boolean actual = PalindromeChecker.isPalindrome(word);

		//then
		assertEquals(expected, actual);
	}
}