package net.euler.problem023;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void test() {
		assertTrue(Problem.canBeWrittenAsSum(30));
		assertFalse(Problem.canBeWrittenAsSum(29));
	}

}
