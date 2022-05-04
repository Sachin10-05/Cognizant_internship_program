#include <iostream>
using namespace std;
 
class Product
{
  public:
    int markedPrice(){
        //Implement your code
        return 1000;
    }
    int discount(){
          //Implement your code
          return 40;
    }
    
};
 
class Dress : public Product
{
  public:
    char calculateShirtSize(int chestSize){
          //Implement your code
          if(chestSize>=20 && chestSize<=30) return 'S';
          else if(chestSize>=31 && chestSize<=40) return 'M';
          else if(chestSize>40) return 'L';
    }

};

 class Shirt  : public Dress
 {
  public:
    int dis;
     int calculatePrice(int chestSize){
       //Implement your code
       dis = (markedPrice()-((markedPrice() * discount())/100));
       if(chestSize>=20 && chestSize<=30) return dis;
       else if(chestSize>=31 && chestSize<=40) return dis=dis+500;
       else if(chestSize>=41) return dis=dis+1000;
     }
};

// main function
int main()
{   int chestSize;
    Dress cs;
    Shirt pr;
    cout<<"Enter the chest size";
    cin>>chestSize;
    cout<<endl<<"Dress Size : "<<cs.calculateShirtSize(chestSize);
    cout<<endl<<"Price : "<<pr.calculatePrice(chestSize);
    return 0;
}
