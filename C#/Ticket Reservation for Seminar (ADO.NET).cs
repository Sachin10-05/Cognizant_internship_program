//***********************************************************************************Program.cs*************************************************************************

using Oracle.ManagedDataAccess.Client;
using Oracle.ManagedDataAccess.Types;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
namespace ADO_Net_App1  //DO NOT change the namespace name
{
    public class Program   //DO NOT change the class name
    {
        string cont = DBConnection.connStr;
        public static void Main(string[] args)
        {
            bool showMenu = true;
            while (showMenu)
            {
                showMenu = MainMenu();
            }
        }

        private static bool MainMenu()
        {
            int input = 0;
            string name; string seatno;
            
            Program pgm = new Program();
            
            Console.WriteLine("Seminar Ticket Booking");
            Console.WriteLine("1. New Booking");
            Console.WriteLine("2. View All Booking");
            Console.WriteLine("3. Update Booking");
            Console.WriteLine("4. Exit");
            input = Convert.ToInt32(Console.ReadLine());

            if (input == 1)
            {
                Console.WriteLine("Booking Name : ");
                name = Console.ReadLine();

                Console.WriteLine("Seat No. : ");
                seatno = Console.ReadLine();

                pgm.NewBooking(name, seatno);
            } 
            else if (input == 2)
            {
                pgm.ViewBooking();
            }
            else if (input == 3)
            {
                Console.WriteLine("Booking Name : ");
                name = Console.ReadLine();

                Console.WriteLine("Seat No. : ");
                seatno = Console.ReadLine();

                pgm.UpdateBooking(name, seatno);
            }
            else if (input == 4)
            {	 	  	  		   	     	      	  	 	
                return false;
            }
            return true;
        }
        
        public void ViewBooking()  //DO NOT change method signature
        {
            //Fill your code here
     //       string cont = DBConnection.connStr;
             using (OracleConnection con = new OracleConnection(cont)){
                   con.Open();
//                   OracleCommand cmd = new OracleCommand("insert into Booking(Name,Seatno) values('"+name+"','"+seatno+"')");
                   OracleCommand cmd = new OracleCommand("select Name,Seatno from Booking",con);
                   OracleDataReader reader = cmd.ExecuteReader();
                   if(reader.HasRows){
                       while(reader.Read()){
                           Console.WriteLine(reader["Name"]+" "+reader["Seatno"]);
                       }
                   }
                  
                }
        }    
        public void NewBooking(string name, string seatno)  //DO NOT change method signature
        {
            //Fill your code here
          
             using (OracleConnection con = new OracleConnection(cont)){
                   con.Open();
                   OracleCommand cmd = new OracleCommand("insert into Booking(Name,Seatno) values('"+name+"','"+seatno+"')",con);
                   cmd.ExecuteNonQuery();
                  Console.WriteLine("---New Booking Saved---");
                  Console.WriteLine(name+" "+seatno);
                }
         }
        public void UpdateBooking(string name, string seatno)   //DO NOT change method signature
        {
            //Fill your code here
          //   string cont = DBConnection.connStr;
            
             using (OracleConnection con = new OracleConnection(cont)){
                   con.Open();
           //        OracleCommand cmd = new OracleCommand("insert into Booking(Name,Seatno) values('"+name+"','"+seatno+"')");
                   OracleCommand cmd1 = new OracleCommand("UPDATE Booking SET Name='"+name+"' WHERE Seatno='"+seatno+"'",con);
                   cmd1.ExecuteNonQuery();
                   Console.WriteLine("---Booking Updated---");
                  Console.WriteLine(name+" "+seatno);
                }
        }
    }
}

















//************************************************************************DBConnection.cs************************************************************************

//This is for your reference. DO NOT make any changes here
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADO_Net_App1
{
    public class DBConnection
    {
        public static String connStr = "User Id=admin;Password=admin;Data Source=localhost:1521/XE;";
    }
}




















