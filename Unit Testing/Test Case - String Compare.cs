//********************************************************************Program.cs**********************************************************************************

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
        public static String FinalMessage()
        {
           return "The total is Rs.7600";
                
        }
    }
}



//******************************************************************FunctionalTest.cs****************************************************************************

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
        public static void value()
        {
            var msg = Program.FinalMessage();
            StringAssert.Contains(msg,"The total is Rs.7600");
        }
    }
}
