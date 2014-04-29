package net.euler.problem007;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testNPrime() {
		assertEquals(13, Problem.nPrime(6));
		assertEquals(104743, Problem.nPrime(10001));
	}
	
	@Test
	public void testIsPrime() {
		assertTrue(Problem.isPrime(2));
		assertTrue(Problem.isPrime(3));
		assertFalse(Problem.isPrime(4));
		assertTrue(Problem.isPrime(5));
		assertFalse(Problem.isPrime(6));
		assertTrue(Problem.isPrime(7));
	}
}
