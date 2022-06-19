import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		while(num != 1)
		{
		    for(int i=2;i<=num;i++)
		    {
		        if(num%i==0)
		        {
		            System.out.print(i+" ");
		            num /= i; 
		        }
		    }
		}
	}

}
