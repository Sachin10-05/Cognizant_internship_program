 using System;
 using System.Collections.Generic;
 using System.Linq;
 using System.Text;
 using System.Threading.Tasks;
 
 namespace ProgFundamentals9
 {
     public class Program
     {
         public static void Main(string[] args)
         { 
             string []name=new string[20];
             string []place=new string[20];
             string []stat=new string[20];
             string []conti=new string[20];
             int i=0;
             do{
                 Console.WriteLine("Enter Name : ");
                 name[i]=Console.ReadLine();
                 Console.WriteLine("Enter Place : ");
                 place[i]=Console.ReadLine();
                 Console.WriteLine("Enter marital status(y/n) : ");
                 stat[i]=Console.ReadLine();
                 Console.WriteLine("Do you wish to continue(y/n) : ");
                 conti[i]=Console.ReadLine();
                 i++;
                 
             }while(String.Equals(conti[i],"y"));
             for(int j=0;j<i;j++)
             {
                 Console.WriteLine("Confirming Information");
                 Console.WriteLine(name[j]+"\n"+place[j]+"\nMarried : "+stat[j]);
                 
             }
             
         }
     }
     
 }
