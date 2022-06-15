using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals8               //DO NOT CHANGE the name of namespace
{
    public class Program                  //DO NOT CHANGE the name of class 'Program'
    { 
        public static void Main(string[] args)      //DO NOT CHANGE 'Main' Signature
        {
           
           // Fill the code here
           Console.Write("Enter starting number : ");
           int num = Convert.ToInt32(Console.ReadLine());
           for(int i=num; i<=num+20; i++)
           {
               if(i%2==0)
               {
                   Console.Write(i+" ");
               }
           }
           
        }
    }
}
