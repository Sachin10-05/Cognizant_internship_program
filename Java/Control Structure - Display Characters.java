
import java.util.Scanner;

public class AsciValue{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the digits:");
        int var1 = sc.nextInt();
        char x1 = (char)var1;
        
        int var2 = sc.nextInt();
        char x2 = (char)var2;
        
        int var3 = sc.nextInt();
        char x3 = (char)var3;
        
        int var4 = sc.nextInt();
        char x4 = (char)var4;
        
        System.out.println(var1+"-"+x1);
        System.out.println(var2+"-"+x2);
        System.out.println(var3+"-"+x3);
        System.out.println(var4+"-"+x4);
    }
    
}
