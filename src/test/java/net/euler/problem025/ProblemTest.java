package net.euler.problem025;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testFibonacciOfDigits() {
		assertEquals(12, Problem.fibonacciOfDigits(3));
		assertEquals(4782, Problem.fibonacciOfDigits(1000));
	}
}
