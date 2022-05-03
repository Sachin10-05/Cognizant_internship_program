#include <iostream>
#include<string>
using namespace std;

int calculateTicketPrice(int price,int noOfAdults)
{
    return price*noOfAdults;
}

int calculateTicketPrice(int price ,int noOfAdults,int noOfKids)
{
    int res;
    res=(price*noOfAdults) + (price*noOfKids*0.5);
    return res;
}

int calculateTicketPrice(int price ,int noOfAdults,bool camera)
{
    if(camera==1)
        return (noOfAdults*price) + 100;
    else
        return noOfAdults*price;
}


int calculateTicketPrice(int noOfStudents)
{
    return 100*noOfStudents;
}


int main()   //DO NOT change the 'main' signature
{
    cout<<calculateTicketPrice(1000,3)<<endl;
    cout<<calculateTicketPrice(1000,3,2)<<endl;
    cout<<calculateTicketPrice(1000,3,true)<<endl;
    cout<<calculateTicketPrice(10);
    return 0;
}
