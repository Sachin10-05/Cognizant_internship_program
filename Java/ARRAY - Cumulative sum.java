import java.util.Scanner;

public class CumulativeSum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		if(n>0){
		int arr[] = new int[n];
	   
		System.out.println("Enter the elements");
		int sum = 0;
	
		for (int i=0; i<n; i++)
		{
		    arr[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++)
	    {
	        sum+=arr[i];
	    
	    System.out.print(sum+" ");
	    }
	    }
	    
	    else
	        System.out.println("Invalid Range");
	    
	    
	}

}
