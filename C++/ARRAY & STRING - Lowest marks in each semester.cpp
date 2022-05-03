#include <iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;


int main() 
{
    //Fill code here
    int sem;
    int sub;
    int marks;
    int i,j,k,min,max;
   
    
    cout << "Enter number of semester: " << endl;
    cin >> sem;                                                                                       // No of semester
    
    for(int i=0;i<sem;i++)
    {
        cout << "Enter number of subjects in " << (i+1) << " semester" << ':' << endl;
        cin >> sub;                                                                                   // No of subject in sem-1
        
        
        int arr[sub];
        int size = sub;
        cout << "Marks obtained in semester " << (i+1) <<':' << endl;
         
        for(int j=0;j<sub;j++)
        {
			cin >> arr[j];
			if(arr[j]<0 || arr[j]>100)
				cout << "You have entered invalid mark" << endl;	
		}
        
        
			
		min = arr[0];
		for(int k=0;k<size;k++)
		{
			if(arr[k] < min)
				min = arr[k];
			
		}
		cout << "Minimum marks in " << (i+1) << " semester:" << min << endl; 
		 	
        
    }
}
