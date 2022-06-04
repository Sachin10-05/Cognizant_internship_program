//****************************************************************************AccountDetails.cs**********************************************************************

using System;

    
    public class Account
    {
        private int id;
        private string accountType;
        private double balance;
        
        public int Id 
        {
            set {id = value;}
            get {return id;}
        }
        public string AccountType 
        {
            set {accountType = value;}
            get {return accountType;}
        }
        public double Balance 
        {
            set {balance = value;}
            get {return balance;}
        }
        
        public Account()                                                // empty constructor
        {
            
        }
        
        public Account(int Id, string AccountType, double Balance)      // constructor with parameter
        {
            this.Id = Id;
            this.AccountType = AccountType;
            this.Balance = Balance;
        }
        
        public bool WithDraw(double amt)                                // method-1
        {
            if(Balance > amt)
            {
                Balance = Balance-amt;
                return true;
            }
            else
                return false;
        }
        
        public string GetDetails()                                       // method-2
        {
            Console.WriteLine("Account Id: " + Id);
            Console.WriteLine("Account Type: " + AccountType);
            Console.WriteLine("Balance: " + Balance);
            return AccountType;
            
            
        }
    }
    
    





    public class Program
    {
        static void Main(string[] args)
        {
            int id1;
            string account1;
            double balance1;
            double amt;
            
            Console.WriteLine("Enter account id");
            id1 = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Enter acount type");
            account1 = Console.ReadLine();
            
            Console.WriteLine("Enter account balance");
            balance1 = Convert.ToDouble(Console.ReadLine());
            
            Console.WriteLine("Enter amount to withdraw");
            amt = Convert.ToDouble(Console.ReadLine());
            
            Account Ac = new Account(id1,account1,balance1);   // object for Account class
            Ac.GetDetails();
            
            if(balance1>amt)
            {
                Console.WriteLine("New Balance: " + (balance1-amt));
            }
        }
    }
