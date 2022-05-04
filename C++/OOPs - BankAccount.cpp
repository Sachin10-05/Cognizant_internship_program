#include<iostream>
using namespace std;

class BankAccount
{
    private:
        double _balance;
	public:
	    virtual double withdrawal(double amount)
	    {
	        
	    }
	    
	    void setBalance(double balance)                  // setter
	    {
	        _balance = balance;
	    }
	    
	    double getBalance()                              // getter
	    {
	        return _balance;
	    }
	    
};




class SavingsAccount: public BankAccount
{
	public:
	    double withdrawal(double amount)
	    {
	        int result = getBalance()-amount;
	        setBalance(result);
	        return getBalance();
	    }
};




int main()
{
	double balance,amount;
	
	cin>>balance>>amount;
	
	SavingsAccount obj;
	obj.setBalance(balance);
	obj.withdrawal(amount);
	
	cout <<"Available balance: "<<obj.getBalance()<<endl;
	return 0;
}
