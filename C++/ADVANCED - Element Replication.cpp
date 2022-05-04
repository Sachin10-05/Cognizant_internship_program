#include <iostream>
#include <exception>
#include <string>
using namespace std;

void elementReplication()
{
    // Implement your code here
    int size;
    cout << "Enter the size of an array\n";
    cin >> size;

    int *data = new int[size];

    cout << "Enter the array elements\n";
    for (int i = 0; i < size; i++)
        cin >> data[i];

    int temp;
    cout << "Enter the position of the element to be replicated\n";
    cin >> temp;

    if (temp < 0 || temp > size - 1)
    {
        throw runtime_error("Array index is out of range");
    }

    else
    {
        for (int i = 0; i < size; i++)
        {
            cout << data[i] << " ";
        }

        cout << data[temp];
    }
}

int main()
{

    try
    {
        // Call the function
        elementReplication();
    }
    catch (exception &e)
    {
        cerr << e.what();
    }
}
