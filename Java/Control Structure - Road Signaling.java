
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the color");
        String color = sc.nextLine();
        
        if(color.equals("green"))
        {
            System.out.println("go");
        }
        else if(color.equals("red"))
        {
            System.out.println("stop");
        }
        else if(color.equals("yellow"))
        {
            System.out.println("proceed with caution");
        }
        else
        {
            System.out.println("prepare to go");
        }
    }
    
}
