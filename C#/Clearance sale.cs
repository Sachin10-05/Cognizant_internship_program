using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals7{
  public class Program
  {
    public static void Main(string[] args)
    {
      
        Console.WriteLine("Enter the name of the product :");
        String name = Console.ReadLine();
        Console.WriteLine("Enter the price of the product :");
        int price = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Is the product on SALE (yes/no) :");
        String sale = Console.ReadLine();
        Console.WriteLine("Enter number of product sold in day 1");
        int day1 = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter number of product sold in day 2");
        int day2 = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter number of product sold in day 3");
        int day3 = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine(name);
        if(sale == "yes")
        {
   
            double day1sale = (day1 * price * 0.93);
            Console.WriteLine("Day 1 sales total : "+ day1sale);
            double day2sale = (day2* 0.93 * 0.93 * price);
            Console.WriteLine("Day 2 sales total : "+ day2sale);
            double percent = (0.93*0.93*0.93);
            int day3sale = (int)(day3 * (price * percent));
            Console.WriteLine("Day 3 sales total : "+ day3sale);
        }
        else if(sale == "no")
        {
            int day1sale = (day1*price);
            Console.WriteLine("Day 1 sales total : "+day1sale);
            int day2sale = (day2*price);
            Console.WriteLine("Day 2 sales total : "+day2sale);
            int day3sale = (day3*price);
            Console.WriteLine("Day 3 sales total : "+day3sale);
        }
        
        
    }
}
}
