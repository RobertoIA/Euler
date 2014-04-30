package net.euler.problem009;


/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2. For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. There
 * exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the
 * product abc.
 */
public class Problem {

	public static void main(String[] args) {
		int[] triplet = getPythagoreanTriplet(1000);
		int result = 1;
		for (int i : triplet)
			result *= i;
		System.out.println(result);
	}

	static int[] getPythagoreanTriplet(int sum) {
		for (int a = 1; a < sum / 2; a++)
			for (int b = a + 1; b < sum / 2; b++)
				for (int c = b + 1; c < sum / 2; c++)
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
							&& a + b + c == sum)
						return new int[] { a, b, c };
		return null;
	}
}
