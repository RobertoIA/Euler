package net.euler.problem010;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void test() {
		assertEquals(17, Problem.sumeOfPrimes(10));
		assertEquals(142913828922L, Problem.sumeOfPrimes(2000000));
	}

}
