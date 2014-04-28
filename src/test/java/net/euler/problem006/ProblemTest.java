package net.euler.problem006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void testSumOfSquares() {
		assertEquals(385, Problem.sumOfSquares(10));
	}
	@Test
	public void testSquareOfSums() {
		assertEquals(3025, Problem.squareOfSum(10));
	}
}
