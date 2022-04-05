package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

		//Split the String into array and iterate over it
		List<String> s=new ArrayList<String>();
		String[] st=text.split(" ");
		
		//added the separated strings into arraylist
		for(String a: st)
			s.add(a);
		
		//System.out.println(s);
		//linkedhashset for removing duplicates and arrange same order
		LinkedHashSet<String> result=new LinkedHashSet<String>(); 
		
		//adding the data to set for removing duplicates
		for(int i=0;i<s.size();i++)
		{
			result.add(s.get(i));
		}
		//Printing the string without duplicates
		Iterator<String> i=result.iterator();  
        while(i.hasNext())  
        {  
        System.out.print(i.next());  System.out.print(" ");
        }  
	}

}
