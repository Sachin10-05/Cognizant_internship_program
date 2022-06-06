//***********************************************************************************Program.cs**********************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DateEx1              
{
    public class Program     
    {
        public static void Main(string[] args)  
        {
            string dob;
            Console.WriteLine("Enter the date of birth (dd-mm-yyyy): ");
            dob = Console.ReadLine();
            Console.WriteLine(calculateAge(dob));
        }

        public static int calculateAge(string dateOfBirth)
        {
            
            DateTime  DOB =  DateTime.ParseExact(dateOfBirth,"dd-MM-yyyy", null);           // using DateTime
            DateTime present = DateTime.Now;
            int age = 0;
            age = present.Year- DOB.Year;
            if(present.DayOfYear < DOB.DayOfYear){
                age -=1;
            }
            return age;

        }


    }
}
