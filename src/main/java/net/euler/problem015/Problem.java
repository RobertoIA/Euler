package net.euler.problem015;

import java.util.BitSet;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */
public class Problem {

	static int count = 0;

	public static void main(String[] args) {
		System.out.println(routes(2));
		System.out.println(routes(20));
		System.out.println("OK");
	}

	static long routes(int gridSize) {
		count = 0;
		permutation(new BitSet(gridSize * 2), 0, gridSize * 2);
		return count;
	}

	private static void permutation(BitSet permutationPartial, int filled,
			int total) {
		BitSet permutation = (BitSet) permutationPartial.clone();
		
		int sum = 0;
		for (int i = 0; i < permutation.length(); i++)
			if (permutation.get(i))
				sum++;
		
		if(sum > total / 2) return;
		
		if (filled == total) {
			if (sum == total / 2)
				count++;
			return;
		}
		permutation.set(filled, false);
		permutation(permutation, filled + 1, total);
		permutation.set(filled, true);
		permutation(permutation, filled + 1, total);
	}
}
