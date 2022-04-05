package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		int size = 0;
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> s = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++)
			s.add(data[i]);

		// Sorting Array list
		Collections.sort(s);
		size = s.size();
		size = size - 2;
		// Pick the 2nd element from the last and print it
		System.out.println("The Second Largest Number " + s.get(size));

	}

}
