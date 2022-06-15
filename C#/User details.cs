using System;
namespace hello
{
    class program
    {
        static void Main(string[] args)
        {
            long mob;
            Console.WriteLine("Enter name\n");
            string name = Console.ReadLine();
            Console.WriteLine("Enter age(completed years and months)");
            
            double age = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter gender('M' for Male and 'F' for Female)");
            string g = Console.ReadLine();
            Console.WriteLine("Enter city");
            string city = Console.ReadLine();
            Console.WriteLine("Enter mobile number");
            mob = long.Parse(Console.ReadLine());
            Console.WriteLine("Enter pincode");
            int pin = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Name:    "+name);
            Console.WriteLine("Age:     "+age);
            Console.WriteLine("Gender:  "+g);
            Console.WriteLine("City:    "+city);
            Console.WriteLine("Mobile:  "+mob);
            Console.WriteLine("Pincode: "+pin);
            
            
        }
    }
}
