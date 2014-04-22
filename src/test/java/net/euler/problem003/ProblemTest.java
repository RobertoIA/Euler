package net.euler.problem003;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void testPrimeFactors() {
		List<Integer> primeFactors = Problem.primeFactors(13195);
		assertEquals(29, (int) primeFactors.get(primeFactors.size() - 1));

		primeFactors = Problem.primeFactors(600851475143L);
		assertEquals(6857, (int) primeFactors.get(primeFactors.size() - 1));
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
