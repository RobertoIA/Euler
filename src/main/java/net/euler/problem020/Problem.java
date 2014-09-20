package net.euler.problem020;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(sumDigits(100));
	}

	static int sumDigits(int n) {
		String factorial = factorial(n).toString();
		int sum = 0;
		
		for(char digit : factorial.toCharArray())
			sum += Integer.parseInt(digit + "");		
		return sum;
	}

	static BigInteger factorial(int n) {
		BigInteger factorial = new BigInteger("1");
		BigInteger factor = new BigInteger(Integer.toString(n));
		BigInteger minusOne = new BigInteger("-1");

		for (; factor.compareTo(BigInteger.ZERO) == 1; factor = factor.add(minusOne))
			factorial = factorial.multiply(factor);
		return factorial;
	}
}