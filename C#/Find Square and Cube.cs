//*************************************************************************Program.cs*********************************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods2               
{
    public class Program                
    {
        public static void Main(string[] args)       
        {
            //Implement your code here
            
            Console.WriteLine("Enter a Number: ");
            double num = Convert.ToDouble(Console.ReadLine());
            
            double x = FindSquare(num);
            Console.WriteLine("Square of {0} is {1}", num, x);
            // Console.WriteLine("Square of " + num + " is " + x);
            
            double y = FindCube(num);
            Console.WriteLine("Cube of {0} is {1}", num, y );
            // Console.WriteLine("Cube of " + num + " is " + y);
            
        }

      //Implement methods here. Keep the method 'public' and 'static'
        
        public static double FindSquare(double num)
        {
            double Square = num*num;
            return Square;
            // return ("Square of {0} is {1}", num, Square);
        }
        
        
        
        public static double FindCube(double num)
        {
            double Cube = num*num*num;
            return Cube;
            // return ("Cube of {0} is {1}", num, Cube);
        }
    }
}
