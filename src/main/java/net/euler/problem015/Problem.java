package net.euler.problem015;


/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(calculatePaths(20));
	}

	static long calculatePaths(int gridSize) {
		long[][] grid = new long[gridSize + 1][gridSize + 1];
		long right, down;

		for (int i = 0; i <= gridSize; i++)
			grid[gridSize][i] = grid[i][gridSize] = 1;

		for (int i = 1; i <= gridSize; i++) {
			for(int j = 1; j <= gridSize; j++) {
				right = grid[gridSize - i + 1][gridSize - j];
				down = grid[gridSize - i][gridSize - j + 1];
				grid[gridSize - i][gridSize - j] = right + down;
			}
		}

		return grid[0][0];
	}
}
