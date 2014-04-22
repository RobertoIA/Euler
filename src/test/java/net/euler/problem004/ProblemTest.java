package net.euler.problem004;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void testLargestPalindromeProduct() {
		assertEquals(9009, Problem.largestPalindromeProduct(2));
		assertEquals(906609, Problem.largestPalindromeProduct(3));
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(Problem.isPalindrome(9009));
		assertTrue(Problem.isPalindrome(121));
		assertFalse(Problem.isPalindrome(1234));
	}
}
