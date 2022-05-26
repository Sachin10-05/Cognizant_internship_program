//******************************************************************FunctionalTest.cs********************************************************************************

using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;

namespace AssetProject
{
    //Add required NUnit test attribute
    [TestFixture]
    public class FunctionalTest
    {
        //Add required test methods
        [Test]
        //[TestCase(new Asset("first","ncat","mod1",1005.0))]
        public void TestValidAsset(){
            AssetBO a = new AssetBO();
            
            string s = a.ValidateAsset(new Asset("first","ncat","mod1",1005.0));
            Assert.That(s,Does.Contain("Asset Valid").IgnoreCase);
        }
        [Test]
        public void TestInValidAsset()
        {
            AssetBO a = new AssetBO();
            // var x = a.ValidateAsset(new Assset("first","ncat","mod1",10.0);
            // Assert.That(x,Is.Typeof<string>());
            Assert.That(()=>a.ValidateAsset(new Asset("first","ncat","mod1",10.0)),Throws.TypeOf<InvalidCostException>());
        }
        
    }
}






//*****************************************************************Asset.cs**************************************************************************************

//THIS IS FOR REFERENCE ONLY. YOU NEED NOT MAKE ANY CHANGES HERE
using System;

namespace AssetProject
{
    public class Asset
    {
        private string _name;
        private string _category;
        private string _model;
        private double _cost;
        
        public string Name{ get; set; }
        public string Category{ get; set; }
        public string Model{ get; set; }
        public double Cost{ get; set; }
        
        public Asset(){}
        public Asset(string name,string category,string model,double cost)
        {
            _name=name;
            _category=category;
            _model=model;
            _cost=cost;
        }
        
    }
}






//****************************************************************************AssetBO.cs**************************************************************************

//THIS IS FOR REFERENCE ONLY. YOU NEED NOT MAKE ANY CHANGES HERE
using System;

namespace AssetProject
{
    public class AssetBO
    {
        public string ValidateAsset(Asset asset)
        {
            if(asset.Cost > 1000 && asset.Cost < 10000)
                return "Asset Valid";
            else
                throw new InvalidCostException();
        }
    }
    
    public class InvalidCostException : Exception
    {
        public InvalidCostException(){}
    }
}
