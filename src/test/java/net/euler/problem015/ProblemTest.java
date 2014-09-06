package net.euler.problem015;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testroutes() {
		assertEquals(6, Problem.calculatePaths(2));
		assertEquals(137846528820l, Problem.calculatePaths(20));
	}

}
