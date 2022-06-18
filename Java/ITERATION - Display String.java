import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the String");
		String word = sc.nextLine();
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num>1)
		{
		    for(int i=0;i<num;i++)
		    {
		        System.out.println(word);
		    }
		}
		else{
		    System.out.println(num+" is not a valid input");
		}
	}

}
