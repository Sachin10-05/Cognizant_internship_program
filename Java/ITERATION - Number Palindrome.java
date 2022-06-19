import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		int reverse = 0;
		int last_digit;
		
		if(num<0)
		{
		    System.out.println("Invalid Input");
		}
		else
		{
		    while(num != 0)
		    {
		        last_digit = num%10;
		        reverse = reverse*10 + last_digit;
		        num/=10;
		    }
		    if(num==reverse)
		    {
		        System.out.println("Palindrome");
		    }
		    else
		    {
		        System.out.println("Not a Palindrome");
		    }
		}
	}

}
