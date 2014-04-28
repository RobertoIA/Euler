package net.euler.problem005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void testEvenlyDivisibleBy() {
		assertEquals(2520, Problem.evenlyDivisibleBy(1, 10));
		assertEquals(232792560, Problem.evenlyDivisibleBy(1, 20));
	}

}
