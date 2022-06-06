//**************************************************************************Program.cs****************************************************************************

using System;
using System.Collections;
using System.Collections.Generic;
using System.Globalization;
using System.IO;


    public class Program  //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args) //DO NOT CHANGE 'Main' Signature
        {
            
            //Fill the code here
            
            string name;
            string id;
            DateTime date = new DateTime();
            double cost;
            List<Product> ProductList = new List<Product>();
            CultureInfo provider = CultureInfo.InvariantCulture;
            
            using(StreamReader reader = new StreamReader(@"input.csv")){
                while(!reader.EndOfStream){
                    string line = reader.ReadLine();
                    string[] values = line.Split(',');
                    name = values[0].Trim();
                    id = values[1].Trim();
                    date = DateTime.ParseExact(values[2].Trim(), "dd-mm-yyyy", provider);
                    cost = Convert.ToDouble(values[3].Trim());
                    Product obj = new Product(name, id, date, cost);
                    ProductList.Add(obj);
                }
            }
            Console.WriteLine("{0,-15}{1,-15}{2,-15}{3,-15}","Product Name","Serial Number","Purchase Date","Purchase Cost");
            foreach(var k in ProductList)
            {
                Console.WriteLine(k.ToString());
            }
            
        }


    }
