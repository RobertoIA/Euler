package net.euler.problem009;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testGetPythagoreanTriplet() {
		assertArrayEquals(new int[] {3, 4, 5}, Problem.getPythagoreanTriplet(12));
		assertArrayEquals(new int[] {200, 375, 425}, Problem.getPythagoreanTriplet(1000));
	}
}
