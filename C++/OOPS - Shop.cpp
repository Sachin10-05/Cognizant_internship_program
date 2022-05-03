#include <iostream>
using namespace std;

class Shop {

    private:
      //Declare the attributes
      string itemName;
      string itemQuantity;
      double itemPrice;

    public:
         //Getters and setters for above variables.
         void setItemName(string iname){
             itemName = iname;
         }
         void setItemQuantity(string iqty){
             itemQuantity = iqty;
         }
         void setItemPrice(double iprice){
             itemPrice = iprice;
         }
         string getItemName(){
             return itemName;
         }
         string getItemQuantity(){
             return itemQuantity;
         }
         double getItemPrice(){
             return itemPrice;
         }
};

int main(){
        // set the values 
        // get the values and print 
        string name, qty;
        double p;
        Shop s;                     // object for shop class
        
        cout<<"Enter the item name";
        cin>>name;
        cout<<"Enter the item quantity:";
        cin>>qty;
        cout<<"Enter the item price";
        cin>>p;
        
        s.setItemName(name);
        s.setItemQuantity(qty);
        s.setItemPrice(p);
        
        cout<<"Item Name:"<<s.getItemName()<<"\n";
        cout<<"Item Quantity:"<<s.getItemQuantity()<<"\n";
        cout<<"Item Price:"<<s.getItemPrice()<<"\n";
    }




















