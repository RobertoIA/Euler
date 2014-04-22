package net.euler.problem001;

import junit.framework.TestCase;

import org.junit.Test;

public class ProblemTest extends TestCase {
	@Test
	public void testGetSumOfMultiples() {
		assertEquals(23, Problem.getSumOfMultiples(10, new int[] { 3, 5 }));
		assertEquals(233168, Problem.getSumOfMultiples(1000, new int[] { 3, 5 }));
	}
}
