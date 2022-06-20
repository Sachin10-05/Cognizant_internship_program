
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int i;
        int j;
        int n;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
