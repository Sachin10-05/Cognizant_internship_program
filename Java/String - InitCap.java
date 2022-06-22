import java.util.Scanner;

public class InitCap {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the String:");
		
		String original = sc.nextLine();
		String[] word = original.split(" ");
		String result = "";
		int wordno = word.length;
		int count = 0;
		
		for(int i=0;i<wordno;i++)
		{
		    if (Character.isLowerCase(word[i].charAt(0)))
		        result = result + (word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase())+" ";
		    else
		    {
		        count++;
		        result = result+word[i]+" ";
		    }
		}
		
		if(count == wordno)
		    System.out.println("First character of each word is already in uppercase");
	    else
	        System.out.println(result);
	}

}
