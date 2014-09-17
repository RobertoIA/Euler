package net.euler.problem019;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void test() {
		Problem problem = new Problem();
		assertEquals(171, problem.countFirstSundays(1901, 2000));
	}

}
