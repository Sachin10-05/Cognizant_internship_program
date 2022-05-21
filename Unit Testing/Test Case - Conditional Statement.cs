//**********************************************************************Program.cs************************************************************************************

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
        
        
        public static string CalculateGrade(float mark)
        {
            string grade="";
            if(mark <40)
                grade="FAIL";
            else if(mark >= 40)
                grade="PASS";
            return grade;    
        }
    }
}







//************************************************************************FunctionalTest.cs****************************************************************************
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
        [TestCase(42,"pass")]
        [TestCase(20,"fail")]
        [TestCase(40,"pass")]
        public static void CalculateGrade(int a, string b)
        {
            var x = Program.CalculateGrade(a);
            Assert.That(x, Is.EqualTo(b).IgnoreCase);
        }
        
    }
}
