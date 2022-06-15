     using System;
     using System.Collections.Generic;
     using System.Linq;
     using System.Text;
     using System.Threading.Tasks;
     
     
         class Program
         {
             public static void Main()
             {
                Console.WriteLine("Enter product id");
                int id=Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter product name");
                string p_name=Console.ReadLine();
                Console.WriteLine("Enter product price");
                double price=Convert.ToDouble(Console.ReadLine());
                
                Product p=new Product();
                
                p.ProductId=id;
                p.ProductName=p_name;
                p.Price=price;
                p.Display();
           }
        }
        
       class Product
       {
            private int productId;
            private string productName;
            private double price=0;
            
            public int ProductId
            {
               get
               {
                    return productId;
               }
               set
               {
                    productId=value;
               }
            }
            
            public string ProductName{
               get{
                    return productName;
                }
                set{
                    productName=value;
                }
            }
            
            public double Price{
                get{
                   return price;
                }
                set{
                    if(value<0)
                        price=0;
                    else
                        price=value;
                }
            }
            
            public void Display()
            {
                Console.WriteLine("Product ID: "+productId);
                Console.WriteLine("Product Name: "+productName);
                Console.WriteLine("Product Price: "+price);
            }
        }
