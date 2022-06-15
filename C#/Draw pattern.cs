using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals4              //DO NOT CHANGE the name of namespace
{
    public class Program                 //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
            Console.WriteLine("Enter any alphabet : ");
            char alpha = Convert.ToChar(Console.ReadLine());

            Console.WriteLine("Enter number of repeats : ");
            int rows=Convert.ToInt32(Console.ReadLine());
            int spc=rows+4-1;
            for(int i=1;i<=rows;i++)
            {
                if(i%2!=0){
                    for(int k=spc;k>=1;k--)
                    {
                        Console.Write(" ");
                        
                    }
                    for(int j=1;j<=i;j++)
                    Console.Write(alpha);
                    Console.Write("\n");
                    spc--;
                    
                }
            }
            

        }
    }
}
