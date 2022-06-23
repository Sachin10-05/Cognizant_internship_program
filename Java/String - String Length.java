import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str = sc.nextLine();
		int len = str.length();
		if(len%2==0)
		{
		    System.out.println(len+" even");
		}
		else
		    System.out.println(len+" odd");
	}

}
