package net.euler.problem019;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testIsLeapYear() {
		assertTrue(Problem.isLeapYear(2016));
		assertTrue(Problem.isLeapYear(2008));
		assertFalse(Problem.isLeapYear(2013));
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
