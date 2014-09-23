package net.euler.problem021;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem {

	public static void main(String[] args) {
		System.out.println(getAmicableSum(10000));
	}

	static int getAmicableSum(int max) {
		int[] sums = new int[max];
		int sum = 0;
		boolean insideLimits, amicable;
		for (int i = 2; i < max; i++) {
			if (sums[i] == 0) sums[i] = getSumOfProperDivisors(i);
			insideLimits = sums[i] < max;
			if (insideLimits) {
				if (sums[sums[i]] == 0) sums[sums[i]] = getSumOfProperDivisors(sums[i]);
				amicable = i == sums[sums[i]] && sums[i] == sums[sums[sums[i]]]
						&& i != sums[i];
				if (amicable) sum += i;
			}
		}
		return sum;
	}

	static int getSumOfProperDivisors(int n) {
		int sum = 0;
		for (int i = n / 2; i > 0; i--)
			if (n % i == 0)
				sum += i;
		return sum;
	}
}
