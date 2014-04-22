package net.euler.problem003;

import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(primeFactors(600851475143L));
	}

	static List<Integer> primeFactors(long num) {
		List<Integer> primeFactors = new ArrayList<>();

		for(int i = 2; i <= num; i++) {
			if(isPrime(i) && num % i == 0) {
				num /= i;
				primeFactors.add(i);
			}
		}

		return primeFactors;
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i <= n/2; i++)
			if(n % i == 0) return false;
		return true;
	}
}
