//*************************************************************************Program.cs*****************************************************************************

//THIS IS FOR REFERENCE ONLY. YOU NEED NOT MAKE ANY CHANGES HERE
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoAppCore
{
    public class Program
    {
        public static Employee e1=null;
        
        public static Employee EnrollEmployee()
        {
           return new Employee(){Name ="Tom",Id = "A1234"};
                
        }
    }
    
    public class Employee
    {
        public string Name { get; set; }
        public string Id { get; set; }
    }
}





//*********************************************************************************FunctionalTest.cs******************************************************************
using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;

namespace DemoAppCore
{
    //Add required NUnit test attribute
    [TestFixture]
    class FunctionalTest
    {
        //Add required test methods
        [Test]
        public void e1_test(){
            Employee e = Program.e1;
            Assert.That(e==null);
        }
        [Test]
        public void EnrollEmployeeTest(){
            Employee e1 = Program.EnrollEmployee();
            Assert.NotNull(e1);
        }
        [Test]
        public void get_Name_Test(){
            Employee e2 = Program.EnrollEmployee();
            Assert.That(e2.Name, Is.EqualTo("Tom"));
        }
        [Test]
        public void get_Id_Test(){
            Employee e3 = Program.EnrollEmployee();
            Assert.That(e3.Id, Is.EqualTo("A1234"));
        }
    }
}
