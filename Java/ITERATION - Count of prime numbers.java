import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter starting range");
		int var1 = sc.nextInt();
		System.out.println("Enter ending range");
		int var2 = sc.nextInt();
		
		int count = 0;
		while(var1<var2)
		for(int i=2;i<=var1/2;i++)
		{
            if(var1%i != 0)
            {
                count += 1;
                System.out.print(count);
                var1+=1;
            }
            // else
            // {
                
            // }
		    
		}
		
		
	}

}
