//****************************************************************************ExtractBookCode.cs***********************************************************************

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtractBookCode      
{
    public class Program    
    {
        public static void Main(String[] arg)   
        {
            //Implement code here

            Console.WriteLine("Enter the book code of length 18");
            string book = Console.ReadLine();
            
            if (book.Length != 18)
            {
                Console.WriteLine("Invalid Book Code");
            }
            else
            {
                string dep_code = book.Substring(0,3);              //Department Code
                if (dep_code == "101" || dep_code == "102" || dep_code == "103")
                {
                    Console.WriteLine("Department code : " + dep_code);
                }
                else
                {
                    Console.WriteLine("Invalid Department Code");
                }
                
                
                
                int YoP = Convert.ToInt32(book.Substring(3,4));      // Year of Publication
                if (YoP >= 1900 && YoP <= 2020)
                {
                    Console.WriteLine("Year of Publication : " + YoP);
                }
                else
                {
                    Console.WriteLine("Invalid Year");
                }
                
                
                
                int NoP =  Convert.ToInt32(book.Substring(7,5));   // Number of pages
                if (NoP>=1 && NoP<=99999)
                {
                    Console.WriteLine("number of Pages : " + NoP);
                }
                else
                {
                    Console.WriteLine("Invalid Page Numbers");
                }
                
                
                
                char book_Id = Convert.ToChar(book.Substring(12,1));            //Book ID
                if(Char.IsLetter(book_Id))
                {
                    if  (Char.IsNumber(Convert.ToChar(book.Substring(13,1))) && 
                        char.IsNumber(Convert.ToChar(book.Substring(14,1))) &&
                        char.IsNumber(Convert.ToChar(book.Substring(15,1))) && 
                        char.IsNumber(Convert.ToChar(book.Substring(16,1))) &&
                        char.IsNumber(Convert.ToChar(book.Substring(17,1)))
                        )
                    {
                        Console.WriteLine("Book ID : " + book.Substring(12,6));
                    }
                }
                else
                {
                    Console.WriteLine("Invalid Book ID");
                }
            }
            
        }
    }
}
