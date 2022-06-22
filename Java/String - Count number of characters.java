import java.util.Scanner;

public class Count
{
   public static void main(String[] args)
   {
      Scanner scanner  = new Scanner(System.in);

      System.out.println("Enter your name:");
      String name = scanner.nextLine();
      System.out.println(name+" has "+getLength(name)+" characters");
      
   }
   
   private static int getLength(String str) {
      char[] arr = str.toCharArray();
      int length = 0;
      
      for (char ch: arr) {
         if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ') {
            length ++;
         } else {
            System.out.println("Invalid input");
            System.exit(0);
         }
      }
      return length;
   }
   
}
