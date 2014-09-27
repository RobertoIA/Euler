package net.euler.problem022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */
public class Problem {

	public static void main(String[] args) {
		List<String> orderedNames = getOrderedListOfNames("names.txt");
		long total = 0;
		for(int index = 0; index < orderedNames.size(); index++) {
			total += alphabeticalScore(orderedNames.get(index), index + 1);
		}
		System.out.println(total);
	}

	static List<String> getOrderedListOfNames(String listName) {
		String[] names = null;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				Problem.class.getResourceAsStream(listName)))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.charAt(0) == '\"')
					line = line.substring(1);
				if (line.charAt(line.length() - 1) == '\"')
					line = line.substring(0, line.length() - 1);
				names = line.split("\",\"");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> orderedNames = Arrays.asList(names);
		Collections.sort(orderedNames);
		return orderedNames;
	}

	static int alphabeticalScore(String name, int index) {
		char[] nameChars = name.toCharArray();
		int score = 0;
		for(char character : nameChars)
			score += ((int) character - 64);
		score *= index;
		return score;
	}
}
