package net.euler.problem021;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testGetSumOfProperDivisors() {
		assertEquals(284, Problem.getSumOfProperDivisors(220));
		assertEquals(220, Problem.getSumOfProperDivisors(284));
	}
	
	@Test
	public void testAmicables() {
		assertEquals(31626, Problem.getAmicableSum(10000));
	}
}
