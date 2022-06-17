
import java.util.Scanner;

public class Season{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        
        if(month >= 3 && month<6)
        {
            System.out.println("Season:Spring");
        }
        else if(month>=6 && month<9)
        {
            System.out.println("Season:Summer");
        }
        else if(month>=9 && month<12)
        {
            System.out.println("Season:Autumn");
        }
        else if(month == 12 || (month>0 && month<3))
        {
            System.out.println("Season:Winter");
        }
        else{
            System.out.println("Invalid month");
        }
    }
    
}
