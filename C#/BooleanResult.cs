//*************************************************************************Program.cs*******************************************************************************

using System;
namespace Hello
{
    class program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the value for x");
            string xstr = Console.ReadLine();
            int x = Convert.ToInt32(xstr);
            
            Console.WriteLine("Enter the value for y");
            string ystr = Console.ReadLine();
            int y = Convert.ToInt32(ystr);
            
            if(x<y)
            {
                Console.WriteLine("x is less than y  is true");
            }
            else
            {
                Console.WriteLine("x is less than y is false");
            }
        }
    }
}
