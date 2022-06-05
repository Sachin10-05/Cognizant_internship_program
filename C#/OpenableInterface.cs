//*****************************************************************************Program.cs*****************************************************************************

using System;

public interface IOpenable                       // Class-1
{
    String OpenSesame();
}

public class TreasureBox : IOpenable            // Class-2 : Class-1
{
    public String OpenSesame()
    {
        return "Congratulations , Here is your lucky win";
    }
}

public class Parachute : IOpenable              //Class-3 : Class-1
{
    public String OpenSesame()
    {
        return "Have a thrilling experience flying in air";
    }
}




public class Program
{
    public static void Main(string[] args)
    {
        TreasureBox t = new TreasureBox();
        Parachute p = new Parachute();
        
        Console.WriteLine("Enter the letter found in the paper");
        char ch = Console.ReadLine()[0];
        
        if(ch == 'T')
            Console.WriteLine(t.OpenSesame());
        else if(ch == 'P')
            Console.WriteLine(p.OpenSesame());
    }
}
