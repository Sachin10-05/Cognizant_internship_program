import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num==0)
		{
		    System.out.println("No Factors");
		}
		else
		{
		    System.out.print("1");
		    for(int i=2;i<=Math.abs(num);i++)
		    {
		        if(num%i == 0)
		        {
		            System.out.print(", "+i);
		        }
		    }
		}
	}

}
