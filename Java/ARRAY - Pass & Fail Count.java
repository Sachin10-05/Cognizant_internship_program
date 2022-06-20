import java.util.Scanner;

public class Count {

	public static void main(String[] args){
	    
	    int n;
	    int i;
	    int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of subjects:");
		n = sc.nextInt();
		int pass = 0,fail = 0;
		if(n>0 && n<=20)
		{
		    int[] submarks = new int[n];
		    for(i=0;i<n;i++)
		    {
		        submarks[i] = sc.nextInt();
		        if(submarks[i] >= 50)
		            pass++;
		        else
		            fail++;
		    }
		    
		    if(pass == n && fail == 0)
		        System.out.println("Ram passed in all subjects");
		    else if(pass==0 && fail==n)
		        System.out.println("Ram failed in all subjects");
		    else
		        System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
		}
		else
		{
		    System.out.println("Invalid input range");
		}
		
	}

}
