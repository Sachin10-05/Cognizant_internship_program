
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int i;
        int n;
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number to find");
        x = sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            if (x == arr[i])
            {
                System.out.println(i+1);
                
            }
        }
        System.out.println("0");
        
        
    }
}
