import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String str = sc.nextLine();
		String splt = sc.nextLine();    //from which alphabet to split
		String[] spltstr = str.split(splt); //store splitted in this array
		int len = spltstr.length;
		for (int i=0; i<len;i++){
		    System.out.println(spltstr[i]);
		}
	}

}
