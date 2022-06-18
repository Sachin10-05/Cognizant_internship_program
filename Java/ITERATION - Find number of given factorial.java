import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int fact = 0;
	
	    if(num>0)
	    {
	        for(int i=1;i<=num;i++)
	        {
	            if(num%i==0)
	            {
	                num=num/i;
	                fact = fact+1;
	            }
	            else
	            {
	                break;   
	            }
	        }
	        if(num==1)
	        {
	            System.out.println(fact);
	        }
	        else
	        {
	            System.out.println("Sorry.The given number is not a perfect factorial");
	        }
	        
	    }
	    else{
	        System.out.println("Invalid Input");
	    }
		
	}

}
