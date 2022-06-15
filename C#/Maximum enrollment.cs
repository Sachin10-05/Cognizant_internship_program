using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Departments           //DO NOT CHANGE the name of namespace
{
    public class Program              //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)     //DO NOT CHANGE 'Main' Signature
        {
            Console.WriteLine("Total students placed in CS ");
            //Add code here
            int cs = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Total students placed in MECH ");
            //Add code here
            int mech = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Total students placed in MET ");
            //Add code here
            int met = Convert.ToInt32(Console.ReadLine());
            
            //Implement the logic here
           if(cs>mech && cs>met){
                Console.WriteLine("Highest placement CS");
            
            }
            else if(mech>cs && mech>met){
                Console.WriteLine("Highest placement MECH");
                
            }
            else if(met>mech && met>cs){
                Console.WriteLine("Highest placement MET");
            }
            else if(cs>met && cs==met)
            {
                Console.WriteLine("Highest placement in CS");
                Console.WriteLine("Highest placement in MET");
            }
             else if(cs>met && cs==mech){
                Console.WriteLine("Highest placement CS");
                Console.WriteLine("Highest placement MECH");
                
            }
            else if(met>cs && met==mech){
                Console.WriteLine("Highest placement MET");
                Console.WriteLine("Highest placement MECH");
                
            }
            else if (met>mech && met==cs){
                Console.WriteLine("Highest placement MET");
                Console.WriteLine("Highest placement CS");
                
            }
            else if(mech>met && mech==cs){
                Console.WriteLine("Highest placement MECH");
                Console.WriteLine("Highest placement CS");
                
            }
            else if (mech>cs && mech==met){
                Console.WriteLine("Highest placement MECH");
                Console.WriteLine("Highest placement MET");
            }
        }
    }
}
