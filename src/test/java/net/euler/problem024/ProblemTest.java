package net.euler.problem024;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testFactorial() {
		assertEquals(6, Problem.factorial(3));
		assertEquals(5040, Problem.factorial(7));
	}

	@Test
	public void testGetNPermutation() {
		assertArrayEquals(new int[]{1, 2, 0}, Problem.getNPermutation(4, new int[]{0, 1, 2}));
		assertArrayEquals(new int[]{2, 7, 8, 3, 9, 1, 5, 4, 6, 0}, Problem.getNPermutation(1_000_000, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
	}
}
