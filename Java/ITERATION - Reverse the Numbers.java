import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
	    System.out.println("Enter the number");
	    int num = sc.nextInt();
	    int reversed = 0;
	    
	    while(num != 0)
	    {
	        int last_digit = num%10;
	        reversed = reversed*10 + last_digit;
	        num /= 10;
	    }
	    
	    System.out.println(reversed);
	}

}
