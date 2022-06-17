
import java.util.Scanner;

public class LeapYear{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        
        if(year>999 && year<10000)
        {
            if(year%4==0 && year%100!=0)
            {
                System.out.println("Leap Year");
            }
            else if(year%400==0)
            {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Invalid Year");
        }
    }
    
}
