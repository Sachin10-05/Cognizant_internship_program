using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals5              
{
    public class Program        
    {
    
                static void grade(int mark, string sub){
                    
                    
                    if(mark>=80 && mark<=100){
                        Console.WriteLine(sub+" Grade : A+");
                    }
                    else if(mark>=60 && mark<80){
                    
                        Console.WriteLine(sub+" Grade : A");
                    }
                    else if (mark>=40 && mark<60)
                    {

                        Console.WriteLine(sub+" Grade : B");
                    }
                    else if(mark<40){
                        Console.WriteLine(sub+" Grade : FAIL");
                    
                }
                }

         public static void Main(string[] args)        
        {           
            Console.WriteLine("Enter English marks :");
            int eng=Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter Math marks :");
            int math=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Language marks :");
            int lang=Convert.ToInt32(Console.ReadLine());            
            if(eng<0 ||math<0||lang<0 ){
                Console.WriteLine("Mark cannot be less than 0");
            }
            else{
                
            grade(eng,"English");
            grade(math,"Math");
            grade(lang,"Language");
            
            }
        }
    }
}
