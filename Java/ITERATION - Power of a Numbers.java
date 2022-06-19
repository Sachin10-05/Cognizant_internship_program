import java.util.Scanner;

public class Power {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the digit");
		int digit = sc.nextInt();
		
		int power=1;
		
		if(num<0 || digit<0)
		{
		    System.out.println("Invalid Input");
		}
		else
		{
		    for(int i=1;i<=digit;i++)
		    {
		        power *= num;
		    }
		    System.out.println(power);
		    
		}
	}

}
