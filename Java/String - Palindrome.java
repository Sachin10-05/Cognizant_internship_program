import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the word:");
		String input = sc.nextLine();
		
		String originalinput = input;
		input = input.toLowerCase();
		char[] charArray = input.toCharArray();
		
		for(char c:charArray)
		{
		    if(!Character.isLetter(c))
		    {
		        System.out.println("Invalid Input");
		        return;
		    }
		}
		StringBuilder s = new StringBuilder();
		s.append(input);
		StringBuilder reversed = s.reverse();
		String rev = reversed.toString();
		if(rev.equals(input))
		    System.out.println(originalinput +" is a Palindrome");
	    else
	        System.out.println(originalinput +" is not a Palindrome");
	}

}
