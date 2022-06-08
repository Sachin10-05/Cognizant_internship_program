//****************************************************************************DBConnection.cs**************************************************************************

//This is for your reference. DO NOT change this file
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




//******************************************************************************Progam.cs*****************************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADO_Net_App1
{
    //Do not change any code under this class
    public class Program
    {
        static void Main(string[] args)
        {
            TraineeBO objTraineeBO = new TraineeBO();
            TraineeBL objTraineeBL = new TraineeBL();            
            string traineeName = string.Empty;
            string batchCode = string.Empty;
            int numberOfTrainees =0;

            try
            {
                Console.WriteLine("Enter number of trainees:");
                numberOfTrainees = int.Parse(Console.ReadLine());
            }
            catch(FormatException traineeNumberException)
            {
                Console.WriteLine(traineeNumberException.Message);
                Environment.Exit(0);
            }
        for (int i = 0; i < numberOfTrainees; i++)
            {
                try
                {
                    Console.WriteLine("\nEnter Trainee Name:");
                    traineeName = Console.ReadLine();
                    if (string.IsNullOrEmpty(traineeName))
                        throw new Exception("Trainee Name can not be null or empty");
                    else
                        objTraineeBO.TraineeName = traineeName;
                }
                catch (Exception nameException)
                {
                    Console.WriteLine(nameException.Message);
                    Environment.Exit(0);
                }
                
                try
                {
                    Console.WriteLine("Enter Trainee Id:");
                    objTraineeBO.TraineeId = long.Parse(Console.ReadLine());
                }
                catch(FormatException idException)
                {
                    Console.WriteLine(idException.Message);
                    Environment.Exit(0);
                }
                
                try
                {
                    Console.WriteLine("Enter Trainee Batch Code:");
                    batchCode = Console.ReadLine();
                    if (string.IsNullOrEmpty(batchCode))
                        throw new Exception("Batch Code can not be null or empty");
                    else
                        objTraineeBO.BatchCode = batchCode;
                }
                catch(Exception batchCodeException)
                {
                    Console.WriteLine(batchCodeException.Message);
                    Environment.Exit(0);
                }
                
                bool insertResult = objTraineeBL.SaveTraineeDetails(objTraineeBO);
                if (insertResult == true)
                {
                    Console.WriteLine("Trainee Details Successfully added to database");
                }
                else
                {
                    Console.WriteLine("Trainee insertion failed..Duplicate TraineeId present or wrong application logic");
                    Console.WriteLine("Try Again");
                    i--;
                      
                }
            }
        }
    }
}



//**********************************************************************************TraineeBL.cs**********************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADO_Net_App1
{
    public class TraineeBL
    {
        //Write your code here
        public bool SaveTraineeDetails(TraineeBO objBO)
        {
            TraineeDA tDA = new TraineeDA();
            bool res = tDA.AddTraineeDetails(objBO);
            if (res)
                return true;
            else
                return false;
        }
    }
}






//*********************************************************************************TraineBO.cs**********************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADO_Net_App1
{
   public class TraineeBO
    {
        //Write your code here
       public long traineeId;
       public string traineeName;
       public string batchCode;
       
       public long TraineeId { get; set; }
       public string TraineeName { get; set; }
       public string BatchCode { get; set; }
       
       public TraineeBO()
       {
           
       }
       
       public TraineeBO(long traineeId, string traineeName, string batchCode)
       {
           this.traineeId = traineeId;
           this.traineeName = traineeName;
           this.batchCode = batchCode;
       }
    }
}






//**********************************************************************************TraineeDA.cs********************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Oracle.ManagedDataAccess.Client;
using System.Data;
using System.Configuration;

namespace ADO_Net_App1
{
    public class TraineeDA
    {
        //Write your code here
        public string ConnectionString
            {
                get
                {
                    return DBConnection.connStr;
                }
            }
        
        
    
        public bool AddTraineeDetails(TraineeBO objBO)
        {
            
                
                try
            {
                OracleConnection con = new OracleConnection(ConnectionString);
                con.Open();
                string query = "insert into tblTrainee values(" + objBO.TraineeId + ",'" + objBO.TraineeName + "','" + objBO.BatchCode + "')";
                OracleCommand cmd = new OracleCommand(query, con);
                int i = cmd.ExecuteNonQuery();
                if (i > 0)
                    return true;
                else
                    return false;
            }
            catch(Exception e)
            {
                return false;
            }
        }
    }
}
