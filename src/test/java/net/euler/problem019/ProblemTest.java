package net.euler.problem019;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void test() {
		assertEquals(171, Problem.countFirstSundays(1901, 2000));
	}
}
