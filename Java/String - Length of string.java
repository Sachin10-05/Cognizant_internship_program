import java.util.Scanner;

public class FindLength {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
// 		System.out.println("Enter String:");
		String test = sc.nextLine();
		for(int i=0; i<test.length(); i++){
		    if((test.charAt(i)>='A'&& test.charAt(i)<='Z')|| (test.charAt(i)>='a'
		    && test.charAt(i)<='z')|| test.charAt(i)==' ')
            {
                continue;
            }
            else{
                System.out.println("Invalid String");
                System.exit(0);
            }

		}
		System.out.println("No. of characters is : "+test.length());
	}

}
