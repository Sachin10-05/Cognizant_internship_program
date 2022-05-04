#include <iostream>
#include<string>
using namespace std;


int stringLength(char* str)
{
	int i;
	int count = 0;
	while(str[i] != '\0')
	{
		count += 1;
		i += 1;
	}
	return count;	

}


int main()
{ 
    //Fill code here
    
   	char str[100];
	cin >> str;
	cout << stringLength(str);
    return 0;
}
