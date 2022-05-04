#include<iostream>
using namespace std;

class Player
{
public:
    //Declare membervariables
    int playerID, playedMatches, playerScore;
    string playerName;

public:
void setPlayerID(int playerID){
    this->playerID=playerID;
    
}
 int getPlayerID(){
     return playerID;
 }
 void setPlayerName(int playerName){
     this->playerName=playerName;
        
 }
 string getPlayerName(){
    return playerName;
 }
 void setPlayerScore(int playerScore){
    this->playerScore=playerScore;
        
 }
 int getPlayerScore(){
    return playerScore;
 }
 void setPlayedMatches(int playedMatches){
    this->playedMatches=playedMatches;
        
 }
 int getPlayedMatches(){
    return playedMatches;
 }
 Player(int playerID, string playerName, int playerScore){
    this->playerID=playerID;
    this->playerName=playerName;
    this->playerScore=playerScore;
     
 }
Player(int playerID,string playerName,int playedMatches, int playerScore){
          
    this->playerID=playerID;
    this->playerName=playerName;
    this->playedMatches=playedMatches;
    this->playerScore=playerScore;
}
    //Implement a parameterized constructor for 3 arguments - playerID, playerName and playerScore.
    
    //Implement a parameterized constructor for 4 arguments - playerID, playerName,playedMatches and playerScore.

void displayThreeArgument()
{     
    cout<<"Player ID. : "<<playerID<<""<<endl;
    cout<<"Player Name : "<<playerName<<""<<endl;
    cout<<"Player Score : "<<playerScore<<""<<endl;
         //Implement your code here
}


void displayFourArgument()
{
    cout<<"Player ID. : "<<playerID<<""<<endl;
    cout<<"Player Name : "<<playerName<<""<<endl;
    cout<<"Played Matches : "<<playedMatches<<""<<endl;
    cout<<"Player Score : "<<playerScore<<""<<endl;
    
}    
~Player(){
    cout<<"Destructor Called"<<endl;
    }
    //Implement Destructor here

};
int main(){
    Player p1=Player(1001,"John",130);
    Player p2=Player(1002,"Raj",100,500);
    p1.displayThreeArgument();
    cout<<"--------------------------------"<<endl<<endl;
    p2.displayFourArgument();

    //Implement your code here
    return 0;
}
