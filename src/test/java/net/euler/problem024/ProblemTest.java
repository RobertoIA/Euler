package net.euler.problem024;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testFactorial() {
		assertEquals(6, Problem.factorial(3));
		assertEquals(5040, Problem.factorial(7));
	}

}
