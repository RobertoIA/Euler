package net.euler.problem014;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testSequenceLenght() {
		assertEquals(Problem.sequenceLength(13, 100), 10);
	}
}
