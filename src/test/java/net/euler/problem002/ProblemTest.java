package net.euler.problem002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void testGetSumOfMultiples() {
		assertEquals(44, Problem.getSumOfEvenFibonacci(100));
		assertEquals(4613732, Problem.getSumOfEvenFibonacci(4000000));
	}
}
