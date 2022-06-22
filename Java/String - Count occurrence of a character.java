import java.util.*;
import java.util.regex.Pattern;
public class OccurrenceOfChar {
    
    public static int count(String s, char c){
        int res = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==c)
                res++;
        }
        return res;
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter a word: ");
		String str = sc.nextLine();
		
		if(Pattern.matches("^[a-zA-Z]*$",str) && (!str.isEmpty()))
		{
		    System.out.println("Enter the character: ");
		    char c = sc.next().charAt(0);
		    if(Character.isAlphabetic(c)){
		        if(str.indexOf(c)==-1)
		        {
		            System.out.println("The given character '"+c+"' not present in the given word.");
		        }
		        else{
		            System.out.println("No of '"+c+"' present in the given word is "+count(str,c)+".");
		        }
		        
		    }
		    else{
		            System.out.println("Given character is not an alphabet");
		        }
		    
		}
		else{
		            System.out.println("Not a  valid string");
		        
		    
		}
	}

}
