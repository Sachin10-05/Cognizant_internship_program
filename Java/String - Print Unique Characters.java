import java.util.*;
public class UniqueChar{
    static final int NO_OF_CHARS = 256; 
    static void printDistinct(String str) 
    { 
        char[] chars = str.toCharArray(); 
        for(char c : chars){
            if(Character.isDigit(c)){
                System.out.println("Invalid Sentence"); 
                System.exit(0);
                
            }
            
        }
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
        for (i = 0; i < str.length(); i++) 
        if(str.charAt(i)!=' ') 
        count[(int)str.charAt(i)]++; 
        int n = i; 
        int p=0;
        for (i = 0; i < n; i++) 
        if (count[(int)str.charAt(i)] == 1) {
            p++; 
            
        }
        if(p>0){
            System.out.println("Unique characters :");
            for (i = 0; i < n; i++) {
                if (count[(int)str.charAt(i)] == 1) {
                    System.out.println(str.charAt(i));
                    
                }
                
            }
            
        }else{
            System.out.println("No unique characters");
            
        }
        
    } 
    
  public static void main(String args[]) 
  { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sentence : ");
      String str = sc.nextLine(); 
      printDistinct(str); 
      
  } 
    
}
