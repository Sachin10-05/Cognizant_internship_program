//**********************************************************************Program.cs*********************************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals1         
{
    public class Program    
    { 
        public static void Main(string[] args)       
        {
            //Fill the code here
            Console.WriteLine("Enter your name : ");
            string name = Console.ReadLine();
            
            Console.WriteLine("Enter your age : ");
            int age = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Enter your country : ");
            string c = Console.ReadLine();
            
            Console.WriteLine("Welcome "+name+". Your age is "+age+" and you are from "+c);
        }
    }
}
