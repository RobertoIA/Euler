package net.euler.problem023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number. For example, the sum of the proper divisors of
 * 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than
 * n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest
 * number that can be written as the sum of two abundant numbers is 24. By
 * mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However, this upper limit
 * cannot be reduced any further by analysis even though it is known that the
 * greatest number that cannot be expressed as the sum of two abundant numbers
 * is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum
 * of two abundant numbers.
 */
public class Problem {
	
	static final int BOUND = 28123;
	static List<Integer> abundantNumbers = null;

	public static void main(String[] args) {
		long sum = 0;
		for(int n = 1; n <= BOUND; n++)
			if(!canBeWrittenAsSum(n)) sum += n;
		System.out.println(sum);
	}
	
	static boolean canBeWrittenAsSum(int n) {
		if(abundantNumbers == null) {
			// Ordered list of all abundant numbers < 28123 (cached)
			abundantNumbers = new ArrayList<>();
			for(int i = 0; i <= BOUND; i++)
				if(isAbundant(i)) abundantNumbers.add(i);
			Collections.sort(abundantNumbers);
		}
		
		int upperN, lowerN;
		for(int upper = abundantNumbers.size() - 1; upper >= 0; upper--) {
			upperN = abundantNumbers.get(upper);
			if(upperN >= n) continue; // can't be added to the number
			
			for(int lower = 0; lower <= upper; lower++) {
				lowerN = abundantNumbers.get(lower);
				if(upperN + lowerN == n)  return true;
			}
		}
		return false;
	}
	
	static boolean isAbundant(int n) {
		return n < getSumOfProperDivisors(n);
	}

	static int getSumOfProperDivisors(int n) {
		int sum = 0;
		for (int i = n / 2; i > 0; i--)
			if (n % i == 0)
				sum += i;
		return sum;
	}
}
