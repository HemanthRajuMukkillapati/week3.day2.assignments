package week3.day2.assignments;

public class OccuranceChar {

	public static void main(String[] args) {
		
		//declare string
		String str = "welcome to chennai";
		int count=0;
		//to character array
		char[] c=str.toCharArray();
		//traverse through array
		for(int i=0;i<c.length;i++)
		{
			//comparing the character
			if(c[i]=='e')
			{
				count++;
			}
		}
		System.out.println("The occurance of e = "+count);
	}

}
