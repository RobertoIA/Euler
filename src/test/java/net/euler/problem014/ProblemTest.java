package net.euler.problem014;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testSequenceLenght() {
		assertEquals(10, Problem.sequenceLength(13, 100));
		assertEquals(525, Problem.sequenceLength(837799, 550));
	}
}
