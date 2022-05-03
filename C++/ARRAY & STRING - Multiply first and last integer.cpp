#include <iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;

int main()  
{
    //Fill code here
    
    string a,b,c;
    
    cin>>a;
    int l,x,y;
    l= a.length();
    b=a[0];            // first letter
    c=a[l-1];          // last letter
    
    x=stoi(b);         // type conversion using stoi()
    y=stoi(c);
    
    cout<<"Result:"<<x*y;
    
    // string s;
    // cin>>s;
    // int n=s.length();
    // cout<<"Result:"<<(s[0]-48)*(s[n-1]-48);
    // return 0;
}
