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
        public static List<string> names=null;
        public static List<string> FinalList()
        {
           names=new List<string>();
           names.Add("Peter");
           names.Add("Sally");
           names.Add("Nimmi");
           return names;        
        }
    }
 }
 
 
 
 //***********************************************************************FunctionalTest.cs**************************************************************************
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
        public void Checknull_test(){
            var x = Program.names;
            Assert.That(x,Is.EqualTo(null));
        }
        [Test]
        public void FinalList_test1(){
            var x = Program.FinalList();
            CollectionAssert.AllItemsAreUnique(x);
        }
        [Test]
        public void value()
        {
           List<string> names=new List<string>();
           names.Add("Peter");
           names.Add("Sally");
           names.Add("Nimmi");
           CollectionAssert.AllItemsAreUnique(names);
        
        }
        
    }
}
