using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals12                 //DO NOT CHANGE the name of namespace
{
    public class Program                    //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
           int r,s,i,j;
           Console.Write("Number of Rows : ");
           r=Convert.ToInt32(Console.ReadLine());
           Console.Write("Number of Symbols : ");
           s=Convert.ToInt32(Console.ReadLine());
           for(i=1;i<=(r*2)-1;i++)
           {
               for(j=1;j<=(s*2);j++)
               {
                   if(i%2!=0){
                       if(j%2!=0)
                            Console.Write("/");
                       else
                            Console.Write("\\");
                       
                   }
                   else
                   {
                       if(j==1 || j==(s*2))
                       {
                           Console.Write("|");
                       }
                       else
                       {
                           Console.Write(" ");
                       }
                   }
               }
               Console.WriteLine();
           }
           
        }
    }
}
