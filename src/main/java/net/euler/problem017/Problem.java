package net.euler.problem017;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 *
 */
public class Problem {

	private static final String[] digits = { "ONE", "TWO", "THREE", "FOUR",
			"FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
	private static final String[] tens = { "TEN", "ELEVEN", "TWELVE",
			"THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
			"EIGHTEEN", "NINETEEN" };
	private static final String[] ten_prefix = { "TWENTY", "THIRTY", "FORTY",
			"FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY" };
	private static final String[] hundreds = { "HUNDRED" };
	private static final String[] conj = { "AND" };
	private static final String[] thousands = { "THOUSAND" };

	public static void main(String[] args) {
		count();
		System.out.println(countLetters());
	}

	private static int sumLetters(String[] numbers) {
		int count = 0;
		for (String number : numbers)
			count += number.length();
		return count;
	}

	static int countLetters() {
		int digitsCount, tensCount, hundredsCount, thousandsCount;

		digitsCount = sumLetters(digits);

		tensCount = sumLetters(tens);
		tensCount += (sumLetters(ten_prefix) * (digits.length + 1))
				+ (digitsCount * ten_prefix.length);

		hundredsCount = (digitsCount * 100);
		hundredsCount += ((tensCount + digitsCount) * 9);
		hundredsCount += (sumLetters(hundreds) * digits.length);
		hundredsCount += ((sumLetters(hundreds) + sumLetters(conj)) * 99 * digits.length);

		thousandsCount = sumLetters(new String[] { digits[0], thousands[0] });

		return (digitsCount + tensCount + hundredsCount + thousandsCount);
	}

	private static void count() {
		for (String number : digits)
			System.out.println(number);
		for (String number : tens)
			System.out.println(number);
		for (String prefix : ten_prefix) {
			System.out.println(prefix);
			for (String digit : digits)
				System.out.println(prefix + "-" + digit);
		}
		for (String hundred : digits) {
			System.out.println(hundred + " " + hundreds[0]);
			for (String digit : digits)
				System.out.println(hundred + " " + hundreds[0] + " " + conj[0]
						+ " " + digit);
			for (String number : tens)
				System.out.println(hundred + " " + hundreds[0] + " " + conj[0]
						+ " " + number);
			for (String prefix : ten_prefix) {
				System.out.println(hundred + " " + hundreds[0] + " " + conj[0]
						+ " " + prefix);
				for (String digit : digits)
					System.out.println(hundred + " " + hundreds[0] + " "
							+ conj[0] + " " + prefix + "-" + digit);
			}
		}
		System.out.println(digits[0] + " " + thousands[0]);
	}
}
