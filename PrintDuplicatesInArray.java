package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// declare an int variable named count
		int count;

		// Insert into List
		LinkedList<Integer> l = new LinkedList<Integer>();
		Set<Integer> result = new HashSet<Integer>();

		// Insert into array list
		for (int i = 0; i < arr.length; i++)
			l.add(arr[i]);

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < l.size(); i++) {
			count = 0;
			// iterate from i to the length of the array by adding 1 to it (inner loop
			for (int j = 0; j < l.size(); j++) {
				// compare both the loop variables & check they're equal
				if (l.get(i) == l.get(j))
					// increase the count if both the arrays are equal
					count++;
			}
			// add the number with duplicates
			if (count > 1)
				result.add(l.get(i));
		}
		// print the duplicates
		System.out.println(result);

	}

}
