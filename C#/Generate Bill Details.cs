using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals2 
{
    public class Program     
    {
        public static void Main(string[] args)     
        {
            //Implement the code here
            int pizzas,puffs,pepsi;
            
            Console.Write("Enter the number of pizzas bought: ");
            pizzas = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(pizzas);
            
            Console.Write("Enter the number of puffs bought: ");
            puffs = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(puffs);
            
            Console.Write("Enter the number of pepsi bought: ");
            pepsi = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(pepsi);
            
            
            Console.WriteLine("Bill Details");
            double pizzasCost = pizzas*200;
            double puffsCost = puffs*40;
            double pepsiCost = pepsi*120;
            double totalPrice = (pizzasCost + puffsCost + pepsiCost);
            double gst = (totalPrice*12)/100;
            double cess = (totalPrice*5)/100;
            
            Console.WriteLine("Cost of Pizzas: " + pizzasCost);
            Console.WriteLine("Cost of Puffs: " + puffsCost);
            Console.WriteLine("Cost of Pepsis: " + pepsiCost);
            Console.WriteLine("GST 12%: " + gst);
            Console.WriteLine("CESS 5%: " + cess);
            Console.WriteLine("Total Price: " + totalPrice);
        }
    }
}
