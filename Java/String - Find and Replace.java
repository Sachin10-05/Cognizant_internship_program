 import java.util.*;
 public class ReplaceWord{
     public static void main (String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the String:");
        String a=in.nextLine();
         Character dot=a.charAt(a.length()-1);
         System.out.println("Enter the word to be searched:");
         String b=in.nextLine();
         System.out.println("Enter the word to be replaced:");
         String n=in.nextLine();
         String res="";
         int count=0;
         String[] words=a.split("\\W");
         
         for(String word:words){
             if(word.equals(b)){
                 res=res+n+" ";
                 count=count+1;
             }
             else{
                 res=res+word+" ";
             }
         }
         if(count>=1){
             System.out.print(res.trim());
             if(dot=='.')
             System.out.print(".");
         }
         else{
             System.out.print("The word "+b+" not found");
         }
     }
 }
