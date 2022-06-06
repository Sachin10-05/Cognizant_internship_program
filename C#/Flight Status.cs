//*****************************************************************************Program.cs**************************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DateEx2  
{
    public class Program   
    {
        /*** Dictionary values are hard-coded. Do NOT change ****/
        static Dictionary<string, DateTime> flightSchedule = new Dictionary<string, DateTime>(){
                                                        {"ZW346", Convert.ToDateTime("13:54:10")},
                                                        {"AT489", Convert.ToDateTime("16:30:00")},
                                                        {"BR267", Convert.ToDateTime("21:15:30")}};
                                       
        
        public static void Main(string[] args)  // Main Method
        {
            //Implement your code here
            Console.WriteLine("Enter the Flight Number: ");
            string flightNo = Console.ReadLine();
            Console.WriteLine(flightStatus(flightNo));
        }  
        
        
        
        
        
        public static string flightStatus(string flightNo) 
        {
            //Implement your code here
            
            if(!flightSchedule.ContainsKey(flightNo))
            {
                return "Invalid Flight Number";
            }
            
            DateTime departureTime=flightSchedule[flightNo];
            if(DateTime.UtcNow<departureTime)
            {
                TimeSpan ts=departureTime.Subtract(DateTime.UtcNow);
                return "Time to flight" +" "+ts.ToString();
            }
            else
            {
                return "Flight Already Left";
            }
        }


    }
}
