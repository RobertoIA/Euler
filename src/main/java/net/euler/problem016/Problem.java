package net.euler.problem016;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 *
 */
public class Problem {
	public static void main(String[] args) {
		System.out.println(sumPow(2, 1000));
	}
	
	static int sumPow(int base, int exp) {
		String valString = powOfTwo(exp);
		int result = 0;
		
		for(int i = 0; i < valString.length(); i++)
			result += Integer.parseInt(valString.charAt(i) + "");
			
		return result;
	}
	
	static String powOfTwo(int exp) {
		String binaryResult = "1";
		for(int i = 0; i < exp; i++) binaryResult += 0;
		
		BigInteger result = new BigInteger(binaryResult, 2);
		return result.toString();
	}
}
