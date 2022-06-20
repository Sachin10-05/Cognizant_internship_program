
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int i;
        int n;
        System.out.println("Enter the array size");
        n = sc.nextInt();
        
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
