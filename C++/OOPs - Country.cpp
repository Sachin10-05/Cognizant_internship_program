#include<iostream>
using namespace std;


class Country {
private:
    string countryName;

    //Getters and setters for the Variable
public:
    void setCountryName(string cname) 
    { 
        countryName = cname; 
    }
    string getCountryName() 
    { 
        return countryName;
    }
};






class City : public virtual Country 
{
private:
    string cityName;

    //Getters and setters for the Variable
public:
    void setCityName(string cityName) 
    { 
        this->cityName = cityName;
    }
    string getCityName() 
    { 
        return cityName;
    }
};





class State : public virtual Country 
{
private:
    string stateName;

    //Getters and setters for the Variable
public:
    void setStateName(string stateName) 
    { 
        this->stateName = stateName;
    }
    string getStateName() 
    { 
        return stateName;
    }
};





class CountryInfo : public City, public State 
{
private:
    string countryInfo;
public:
    void display() {
        //Display using getters
        cout << "Country Info:" << endl;
        cout << "Country Name:" << getCountryName() << endl;
        cout << "City Name:" << getCityName() << endl;
        cout << "State Name:" << getStateName() << endl;
    }
};



int main()
{
    //Implement your code here
    CountryInfo c;
    
    string buffer;
    cout << "Enter the Country Name: ";
    cin >> buffer;
    c.setCountryName(buffer);
    
    cout << "Enter the City Name: ";
    cin >> buffer;
    c.setCityName(buffer);
    
    cout << "Enter the State Name: ";
    cin >> buffer;
    c.setStateName(buffer);
    
    c.display();
    return 0;
}
