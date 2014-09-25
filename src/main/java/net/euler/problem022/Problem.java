package net.euler.problem022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem {

	public static void main(String[] args) {
		System.out.println(getOrderedListOfNames("names.txt"));
	}

	static List<String> getOrderedListOfNames(String listName) {
		String[] names = null;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				Problem.class.getResourceAsStream(listName)))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.charAt(0) == '\"') line = line.substring(1);
				if (line.charAt(line.length() - 1) == '\"') line = line.substring(0, line.length() - 2);
				names = line.split("\",\"");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> orderedNames = Arrays.asList(names);
		Collections.sort(orderedNames);
		return orderedNames;
	}
}
