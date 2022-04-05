package week3.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		//Declare the input as Follow
  		String test = "I am a software tester";
  		//split the words and have it in an array
  		String[] s=test.split(" ");
  		//Traverse through each word (using loop)
  		for(int i=0;i<s.length;i++)
  		{
  			//find the odd index within the loop (use mod operator)
  			if(i % 2 != 0)
  			{
  				//string to char array
  				char[] r=s[i].toCharArray();
  				String st="";
  				//reverse the string
  				for(int j=r.length-1 ; j>=0; j--)
  				{
  				st+=r[j];
  				}
  				//Printing reversed string
  				System.out.print(st);System.out.print(" ");
  			}
  			else
  			{
  				//printing non reversed string
  				System.out.print(s[i]);
  				if(i!=s.length-1)
  					System.out.print(" ");
  			}
  		}
		
		
	}

}
