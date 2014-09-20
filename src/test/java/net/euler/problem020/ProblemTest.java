package net.euler.problem020;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testSumDigits() {
		assertEquals(27, Problem.sumDigits(10));
		assertEquals(648, Problem.sumDigits(100));
	}
}
