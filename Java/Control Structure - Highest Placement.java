
import java.util.Scanner;

public class Placement{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the no of students placed in CSE:");
        int var1 = sc.nextInt();
        
        System.out.println("Enter the no of students placed in ECE:");
        int var2 = sc.nextInt();
        
        System.out.println("Enter the no of students placed in MECH:");
        int var3 = sc.nextInt();
        
        if(var1<0 || var2<0 || var3<0)
        {
            System.out.println("Input is Invalid");
        }
        else if(var1==var2 && var2==var3)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(var1==var2 && (var1>var3 || var2>var3))
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(var2==var3 && (var2>var1 || var3>var1))
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        else if(var3==var1 && (var3>var2 || var1>var2))
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if(var1>var2 && var1>var3)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(var2>var1 && var2>var3)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if(var3>var1 && var3>var2)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        
    }
    
}
