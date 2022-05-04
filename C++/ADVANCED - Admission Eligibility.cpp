#include <iostream>
using namespace std;

double eligibility_ForAdmission (int a,int b,int c)  throw (const char*)
{
    //Implement your code here
    if(a<60||b<60||c<60||a+b+c<180)
       throw "Not eligible for Admission";
    return a+b+c;
}


int main()
{
    int physics,chemistry,maths,TotalMark;
    cout<< "Enter the Physics Marks"<<endl;
    cin>>physics;
    cout<< "Enter the Chemistry Marks"<<endl;
    cin>>chemistry;
    cout<<  "Enter the Maths Marks"<<endl;
    cin>>maths;
    
    try
    {
        //Implement your code here
        TotalMark=
        eligibility_ForAdmission(physics,chemistry,maths);
       
        cout<<"Total score is "<<TotalMark;
    } 
    catch(const char*msg)
    {
        cerr<<msg<<endl;
    }
}
