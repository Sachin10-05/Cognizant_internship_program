import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int flag=0;
		
	    if(num1<=0 || num2<=0 || num1 ==num2 || num1>num2)
	    {
	        System.out.println("Provide valid input");
	    }
	    else
	    {
	       for(int i=num1;i<=num2;i++)
	       {
	           if(i==2)
	           {
	               System.out.print(i+" ");
	           }
	           for(int j=2;j<i;j++)
	           {
	               if(i%j ==0)
	               {
	                   flag = 0;
	                   break;
	               }
	               else
	               {
	                   flag = 1;
	               }
	           }
	           if(flag==1)
	           {
	               System.out.print(i+" ");
	           }
	           
	       }
	    }
		

	}

}
