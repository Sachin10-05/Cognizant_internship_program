
import java.util.Scanner;

public class SnacksDetails
{
    
    public static void main(String[] args)
    {
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the no of pizzas bought:");
        int var1 = sc.nextInt();
        
        System.out.println("Enter the no of puffs bought:");
        int var2 = sc.nextInt();
        
        System.out.println("Enter the no of cool drinks bought:");
        int var3 = sc.nextInt();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+var1);
        System.out.println("No of puffs:"+var2);
        System.out.println("No of cooldrinks:"+var3);
        System.out.println("Total price="+((var1*100)+(var2*20)+(var3*10)));
        System.out.println("ENJOY THE SHOW!!!");
        
        
    }
    
}
