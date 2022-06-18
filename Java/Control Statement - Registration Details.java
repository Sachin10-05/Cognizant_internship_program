
import java.util.Scanner;

public class RegistrationDetails{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        System.out.println("Enter your phoneno:");
        long phone = sc.nextLong();
        
        System.out.println("Enter your qualification:");
        String qual = sc.next();
        
        
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String email = sc.next();
        
        System.out.println("Enter your noofexperience[if any]:");
        String noofexp = sc.nextLine();
        
        System.out.println("Dear " +name+ ", Thanks for registering in our portal, registration id will be mailed to " +email+ " within 2 working days");
    }
    
}
