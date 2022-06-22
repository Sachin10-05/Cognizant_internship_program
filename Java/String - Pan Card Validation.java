import java.util.Scanner;

public class PanCard {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the PAN no:");
		String s = sc.nextLine();
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
		{
		    System.out.println("Valid PAN no");
		}else
		
		    System.out.println("Invalid PAN no");
	}

}
