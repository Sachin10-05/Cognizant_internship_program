
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the units consumed");
        int usage = sc.nextInt();
        
        if(usage <= 20)
        {
            System.out.println("No charge");
        }
        else if(usage >20 && usage<100)
        {
            
            System.out.println("You have to pay Rs."+usage*3.5);
        }
        else
        {
            
            System.out.println("You have to pay Rs."+(usage*5.0));
        }
    }
    
}
