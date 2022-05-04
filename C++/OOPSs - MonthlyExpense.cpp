#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class MonthlyExpense 
{
    public:
        double household_exp;
        double medical,total;
   
        
        void setHouseHoldExpense(double houseExp) {
           //Implement your code
           household_exp = houseExp;
        }
       
        void setMedicalExpense(double medical) {
          //Implement your code
          this->medical = medical;
        }


    double totalNovemberExpense() {
        
       //Implement your code
       
        total = household_exp + medical;
        return total;
    }


    double totalDecemberExpense() {
        //Implement your code
    
        total = household_exp + medical;
        return total;
    }


    double totalNovDecExpense() {
        //Implement your code
        total = household_exp + medical;
        return this->total;
    }
    
    MonthlyExpense operator + (const MonthlyExpense b)
    {
       //Implement your code
       MonthlyExpense temp;
       temp.household_exp = household_exp + b.household_exp;
       temp.medical = medical + b.medical;

       return temp;
    }
};


int main() {
    //Implement your code
    MonthlyExpense nov;
    MonthlyExpense dec,res;

    nov.setHouseHoldExpense(10000);
    nov.setMedicalExpense(5000);
    
    dec.setHouseHoldExpense(20000);
    dec.setMedicalExpense(500);
    
    
    cout<<"November Expenses:"<<nov.totalNovemberExpense()<<"\n";
    cout<<"December Expenses:"<<dec.totalDecemberExpense()<<"\n";
    res = nov + dec;
    cout<<"Total Expenses for the month of Nov and Dec:"<<res.totalNovDecExpense();
    
    return 0;
}
