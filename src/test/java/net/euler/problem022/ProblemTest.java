package net.euler.problem022;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void test() {
		int score = Problem.alphabeticalScore(Problem.getOrderedListOfNames("names.txt").get(937), 938);
		assertEquals(49714, score);
	}
}
