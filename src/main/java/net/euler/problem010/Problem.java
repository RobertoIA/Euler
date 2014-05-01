package net.euler.problem010;

import java.util.ArrayList;
import java.util.List;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the
 * primes below two million.
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(sumeOfPrimes(2000000));
	}

	static long sumeOfPrimes(int max) {
		List<Integer> primes = new ArrayList<>();
		primes.add(2); primes.add(3);
		int currPrime = 5;
		double currSqrt;
		boolean isPrime;

		while (currPrime < max) {
			isPrime = true;
			currSqrt = Math.sqrt(currPrime);

			for (int prime : primes) {
				if (prime > currSqrt) break;
				if (currPrime % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) primes.add(currPrime);
			currPrime += 2;
		}

		long sum = 0;
		for (int prime : primes) sum += prime;
		return sum;
	}
}
