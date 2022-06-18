
import java.util.Scanner;

public class IncrementCalculation{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        
        System.out.println("Enter the Performance appraisal rating");
        float rating = sc.nextFloat();
        
        int x = (int)(0.10*salary) + salary;
        int y = (int)(0.25*salary) + salary;
        int z = (int)(0.30*salary) + salary;
        
        if(salary<=0 || rating<1 || rating>5)
        {
            System.out.println("Invalid Input");
        }
        else if(rating>=1 && rating<=3)
        {
            System.out.println(x);
        }
        else if(rating>3.1 && rating<=4)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
    
}
