//****************************************************************************Program.cs*******************************************************************************

using System;

public class Program      //DO NOT change the class name
{
    //implement code here
    static void Main(string[] args)
    {
        Console.WriteLine("Enter first name");
        string fname = Console.ReadLine();
        
        Console.WriteLine("Enter last name");
        string lname = Console.ReadLine();
        
        Console.WriteLine("Full name: " + fname + " " + lname);
    }
}
