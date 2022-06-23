import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str = sc.nextLine();
		String sub_str = sc.nextLine();
		if(str.indexOf(sub_str)!=-1)
		{
		    System.out.println(sub_str+" is contained in a sentence");
		}
		else
		{
		    System.out.println(sub_str+" is not contained in a sentence");
		}
		
	}
}

