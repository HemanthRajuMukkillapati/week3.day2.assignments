package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declare An array for {3,2,11,4,6,7};
		int[] a={3,2,11,4,6,7};
		// Declare another array for {1,2,8,4,9,7};
		int[] b={1,2,8,4,9,7};
		//using arraylist
		List<Integer> aa=new ArrayList<Integer>();
		List<Integer> bb=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			aa.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			bb.add(b[i]);
		}
		//Declare for loop iterator from 0 to array length
		for (int i=0;i<aa.size();i++)
			for(int j=0;j<bb.size();j++)
				//Compare Both the arrays using a condition statement
				if(aa.get(i)==bb.get(j))
					result.add(aa.get(i));
				
		//Print the first array (shoud match item in both arrays)
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i));
			if(i!=result.size()-1)
				System.out.print(",");
		}
	}

}
