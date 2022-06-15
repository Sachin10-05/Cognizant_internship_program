using System;
using System.IO;

public class Person
{
    
    private string firstName;
    private string lastName;
    private DateTime dob;
    
    
    public  string FirstName{
        get{
            return firstName;
        }
        set{
            firstName = value;
        }
    }
    
    public string LastName{
        get{
            return lastName;
        }
        set{
            lastName = value;
        }
    }
    
    public DateTime Dob{
        get{
            return dob;
        }
        set{
            
            dob = value;
        }
    }
    
    public string Adult{
        
        get{
            if(GetAge(Dob) >=18){
            return "Adult";
            }else{
            return "Child";
            }
        }
        
    }
    
    
    public void DisplayDetails(){
        Console.WriteLine("First Name: "+FirstName);
        Console.WriteLine("Last Name: "+LastName);
        Console.WriteLine("Age : "+ GetAge(Dob));
        Console.WriteLine(Adult);
    }
    public int GetAge(DateTime dob){
       int years= DateTime.Now.Year - dob.Year;
       
      if(( dob.Month > DateTime.Now.Month) || (dob.Month == DateTime.Now.Month && dob.Day > DateTime.Now.Day)){
           years--;
       } 
       
       
       return years;
       
    }
    
}

public class Program
{

    public static void Main(String[] args)
    {
         Person person = new Person();
         Console.WriteLine("Enter first name");
         person.FirstName = Console.ReadLine(); 
         Console.WriteLine("Enter last name");
         person.LastName = Console.ReadLine();
         Console.WriteLine("Enter date of birth in yyyy/mm/dd/ format");
         person.Dob = Convert.ToDateTime(Console.ReadLine());
         person.DisplayDetails();
         
         
    }
}

