package week3.day2.assignments;

import java.util.Collections;
import java.util.LinkedList;



public class MissingElementInAnArray {

	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		//Insert into List
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		//Insert into array list
		for(int i=0;i<arr.length;i++)
			l.add(arr[i]);
		
		// Sort the array	
		Collections.sort(l);
		int temp=l.get(0);
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=0;i<l.size();i++)
			if(l.get(i)==temp)
				temp++;
			else
				// print the number
				{System.out.println("The Number Missing is "+temp);
				break;}
				
	

	}

}
