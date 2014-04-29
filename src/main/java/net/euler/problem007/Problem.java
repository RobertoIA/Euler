package net.euler.problem007;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10 001st prime number?
 */
public class Problem {

	public static void main(String[] args) {
		System.out.println(nPrime(10001));
	}

	static int nPrime(int n) {
		int i = 1;
		while (n > 0) {
			i++;
			if (isPrime(i))
				n--;
		}
		return i;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
