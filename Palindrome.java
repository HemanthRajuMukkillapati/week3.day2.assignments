package week3.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		//declare a string
		String str="madam";
		//declare empty string
		String rstr="";
		//traverse from reverse
		for(int i=str.length()-1;i>=0;i--)
		{
			//adding in empty string
			rstr+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(rstr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Plaindrome");
		}
		 
	}

}
