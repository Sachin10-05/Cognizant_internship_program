#include <iostream>
using namespace std;


int main()
{
    char c;
    cout << "Enter a character: \n";
    cin >> c;
    if((int(c)<65 || int(c)>90 ) && (int(c)<97 || int(c)>122))
    {
        cout<< "Invalid\n";
    }
    else
    {
        cout << c << "-" << int(c);
    }
    return 0;
}
