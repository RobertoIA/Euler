package net.euler.problem012;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testTriangleNumber() {
		assertEquals(28, Problem.triangleNumber(5));
		// assertEquals(76576500, Problem.triangleNumber(500));
	}

	@Test
	public void testFactors() {
		assertEquals(4, Problem.factors(21).size());
		assertEquals(6, Problem.factors(28).size());
	}
}
