package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//declare string 1
		String text1="stops";
		//declare string 2
		String text2="potss";
		//comparing both length
		if(text1.length()==text2.length())
		{
			//convert to char array
			char[] arr1=text1.toCharArray();
			char[] arr2=text2.toCharArray();
			
			//sort the both array
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			//compare both array
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
