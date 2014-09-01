package net.euler.problem014;

import java.util.ArrayList;
import java.util.List;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even)
 * 
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 */
public class Problem {
	public static void main(String[] args) {
		int max = 1000000;
		int length = 0;
		List<Integer> candidates = new ArrayList<>();
		List<Integer> selected = new ArrayList<>();

		for (int i = 1; i < 1000000; i++) {
			candidates.add(i);
		}
		
		while (candidates.size() > 1) {
			for (int candidate : candidates) {
				length = sequenceLength(candidate, max);
				if(length == max)
					selected.add(candidate);
			}
			candidates = selected;
			selected = new ArrayList<>();
			
			System.out.println("max: " + max);
			System.out.println("candidates: " + candidates.size());
			System.out.println();
			
			max += 1000000;
		}
		
		System.out.println("Winner: " + candidates.get(0) + ", length " + length);
		System.out.println("OK");
	}

	static int sequenceLength(int n, int max) {
		int length = 1;

		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = (3 * n) + 1;
			length++;
			if (length >= max)
				break;
		}

		return length;
	}
}
