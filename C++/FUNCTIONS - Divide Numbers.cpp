#include <iostream>
using namespace std;

int DivideNumbers(int num){
    //Divide the numbers and return it
    int a=num%10;
    int b=num/10;
    return b/a;
}

int main()
{
    //Call the function and print the result
    int num;
    cout << "Enter the number: \n";
    cin >> num;
    cout << DivideNumbers(num) << endl;
    return 0;
}
