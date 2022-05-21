//****************************************************************Program.cs***************************************************************************************

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
        public static int AddNumbers(int num1,int num2)
        {
            return num1+num2;
        }
        public static int SubNumbers(int num1,int num2)
        {
            return num1-num2;
        }
        public static int MulNumbers(int num1,int num2)
        {
            return num1*num2;
        }
        public static int DivNumbers(int num1,int num2)
        {
            return num1/num2;
        }
    }
}





//*************************************************************************FunctionalTest.cs******************************************************************
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
        public void AddNumbers()
        {
            
            int result = Program.AddNumbers(4, 5);
            Assert.AreEqual(9, result);
        }
        [Test]
        public void SubNumbers()
        {
            
            int result = Program.SubNumbers(5, 1);
            Assert.AreEqual(4, result);
            
        }
        [Test]
        public void MulNumbers()
        {
            
            int result = Program.MulNumbers(4, 5);
            Assert.AreEqual(20, result);
        }
        [Test]
        public void DivNumbers()
        {
            
            int result = Program.DivNumbers(4, 2);
            Assert.AreEqual(2, result);
        }
    }
}
