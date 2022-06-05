//**************************************************************************CalculatorProgram.cs******************************************************************

using System;
    public class Calculator
    {
        public int Addition(int a,int b)
        {
            return (a+b);
        }
        
        public int Subtraction(int a, int b)
        {
            return (a-b);
        }
        
        public int Multiplication(int a, int b)
        {
            return (a*b);
        }
        
        public double Division(int a, int b, out double remainder)
        {
            remainder = (a%b);
            return (Convert.ToInt32(a/b));
        }
    }
    
    
    
    public class Program
    {
        static void Main(string[] args)
        {
            int a,b;
            char op;
            Console.WriteLine("Enter the operator");
            op = Convert.ToChar(Console.ReadLine());
            
            Console.WriteLine("Enter the operands");
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            
            Calculator calc = new Calculator();
            
            switch(op)
            {
                case '+':
                    Console.WriteLine("Result of " + a + op + b + " is " + calc.Addition(a,b));
                    break;
                case '-':
                    Console.WriteLine("Result of " + a + op + b + " is " + calc.Subtraction(a,b));
                    break;
                case '*':
                    Console.WriteLine("Result of " + a + op + b + " is " + calc.Multiplication(a,b));
                    break;
                case'/':
                    double remainder;
                    Console.WriteLine("Result of " + a + op + b + " is " + calc.Division(a,b,out remainder));
                    Console.WriteLine("Remainder =" + remainder);
                    break;
                default:
                    Console.WriteLine("Invalid Operator");
                    break;
            }
        }
    }
