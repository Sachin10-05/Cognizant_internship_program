import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		if(str.equals(str1)){
		    System.out.println("Case sensitive");
		}
		else
		{
		    if(str.equalsIgnoreCase(str1))
		    {
		        System.out.println("Case insensitive");
		    }
		    else{
		        System.out.println("Not equal");
		    }
		}
		
	}

}
