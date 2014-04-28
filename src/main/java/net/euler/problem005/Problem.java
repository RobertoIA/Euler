package net.euler.problem005;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem {
	
	public static void main(String[] args) {
		System.out.println(evenlyDivisibleBy(1, 20));
	}

	static int evenlyDivisibleBy(int min, int max) {
		for(int i = max; ; i += max) {
			for(int div = min; div <=max; div++) {
				if(i % div != 0) break;
				if(div == max) return i;
			}
		}
	}
}
