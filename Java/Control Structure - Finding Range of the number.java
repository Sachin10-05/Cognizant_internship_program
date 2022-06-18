
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if(num>0 && num<=100)
        {
            System.out.println("Range of the number " + num + " is 0 to 100");
        }
        else if(num>100 && num<=200)
        {
            System.out.println("Range of the number " + num + " is 100 to 200");
        }
        else if(num>200 && num<=500)
        {
            System.out.println("Range of the number " + num + " is 200 to 500");
        }
        else{
            System.out.println("Entered Number " + num + " is not in the expected range");
        }
    }
    
}
