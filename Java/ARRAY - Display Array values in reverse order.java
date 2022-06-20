
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int i;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
