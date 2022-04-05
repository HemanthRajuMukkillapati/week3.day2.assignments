package week3.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//Convert the String to character array
		char[] c=test.toCharArray(); 
		//Traverse through each character (using loop)
		for (int i=0;i<c.length;i++)
		{
			int j=c[i];
			//Character.isLetter
			if(j>=65 && j<=90 || j>=97 && j<=122)
			{
				letter++;
			}
			//Character.isDigit
			else if(j>=48 && j<=57)
			{
				num++;
			}
			//Character.isSpaceChar
			else if(j==32)
			{
				space++;
			}
			//else -> consider as special character
			else
			{
				specialChar++;
			}
		}
		
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
