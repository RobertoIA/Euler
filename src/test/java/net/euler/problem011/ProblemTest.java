package net.euler.problem011;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {
	@Test
	public void test() {
		int[][] grid = new int[][] { { 8, 2, 22, 97 }, { 49, 49, 99, 40 },
				{ 81, 49, 31, 73 }, { 52, 70, 95, 23 } };
		assertEquals(24468444, Problem.adjacentProduct(grid, 4));
	}
}
