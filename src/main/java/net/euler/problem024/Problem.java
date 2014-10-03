package net.euler.problem024;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one
 * possible permutation of the digits 1, 2, 3 and 4. If all of the permutations
 * are listed numerically or alphabetically, we call it lexicographic order. The
 * lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012 021 102 120 201 210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4,
 * 5, 6, 7, 8 and 9?
 */
public class Problem {

	public static void main(String[] args) {
		System.out.println(getNPermutation(1, new int[]{0, 1, 2}));
		System.out.println(getNPermutation(2, new int[]{0, 1, 2}));
		System.out.println(getNPermutation(3, new int[]{0, 1, 2}));
		System.out.println(getNPermutation(4, new int[]{0, 1, 2}));
		System.out.println(getNPermutation(5, new int[]{0, 1, 2}));
		System.out.println(getNPermutation(6, new int[]{0, 1, 2}));
	}

	static int getNPermutation(int n, int[] digits) {
		int permutation = 0;
		
		for(int i = 0; i < digits.length; i++) {
			permutation += 1 * (digits.length - i - 1);
		}
		
		return permutation;
	}
	
	static int factorial(int n) {
		int factorial = 1;
		while(n > 1) factorial *= n--;
		return factorial;
	}
}
