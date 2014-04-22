package net.euler.problem004;


/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(largestPalindromeProduct(3));
	}

	static int largestPalindromeProduct(int digits) {
		int max = 0;
		for (int i = 0; i < digits; i++)
			max = (max * 10) + 9;
		
		int largest = 0;
		int current;

		for (int i = max; i > 0; i--) {
			for (int j = max; j >= i; j--) {
				current = i*j;
				if (isPalindrome(current) && current > largest) {
					largest = current;
				}
			}
		}

		return largest;
	}

	static boolean isPalindrome(int num) {
		int n = num;
		int reverse = 0;
		int digit;

		while (n > 0) {
			digit = n % 10;
			n /= 10;
			reverse = (reverse * 10) + digit;
		}

		return num == reverse;
	}
}
