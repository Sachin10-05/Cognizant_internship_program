
import java.util.Scanner;

public class CelsiusConversion{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        float Celcius = sc.nextFloat();
        float Fahreheit = (9*Celcius)/5 + 32;
        System.out.println(Fahreheit);
    }
    
}
