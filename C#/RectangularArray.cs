using System;

public class Program   //DO NOT change the class name
{
    static void Main(string[] args)       //DO NOT change the 'Main' method signature
    {
        Console.WriteLine("Enter a number:");
        int n=Convert.ToInt32(Console.ReadLine());
        int[,] a=new int[n,n];
        a=GetArray(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Console.Write(a[i,j]+"  ");
            }
            Console.WriteLine();
        }
    }
    
    public static int[,]  GetArray(int n)
    {
          int[,] a=new int[n,n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    a[i,j]=0;
                else if(i>j)
                    a[i,j]=-1;
                else
                    a[i,j]=1;
            }
        }
        return a;
    }
}    
    
