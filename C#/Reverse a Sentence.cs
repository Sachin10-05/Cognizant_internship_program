//********************************************************************Program.cs********************************************************************************

using System;

public class Program      
{
    static void Main(string[] args)
    {
        string s1;
        Console.WriteLine("Enter a string");
        s1 = Console.ReadLine();
        // Console.WriteLine(s1);
        
        string[] s2 = s1.Split(' ');
        for(int i=s2.Length-1;i>-1;i--)
        {
            Console.Write(s2[i]+" ");
        }
    }
}
