using System;
namespace name{
    class project{
        static void Main(string[] args){
            Console.WriteLine("Enter a string");
            string str = Console.ReadLine();
            if(str.Contains("the"))
            {
                Console.WriteLine( str.Replace("the", "that"));
            }
            else
            {
                Console.WriteLine("Word 'the' not found");
            }
        }
    }
}
