#include <iostream>
using namespace std;


int main(){

    int playerchoice ;
    string plrchoice ; 
    int computerchoice ;
    string compchoice ;

    cout<<"Press the following : \n 1- ROCK \n 2- PAPER \n 3- SCISSORS"<<endl;


    cout << "Enter your choice : " << endl;
    cin >> playerchoice ; 



    if( playerchoice == 1){
        plrchoice = "Rock";
    }else if (playerchoice == 2)
    {
        plrchoice = "Paper";
    }else if (playerchoice == 3){
        plrchoice = "Scissor";
    }


    cout << "Player has chose : " << plrchoice << endl;


    computerchoice = (rand() % 3) + 1 ;

    // cout << "The computer choice is : " << computerchoice << endl;

        if( computerchoice == 1){
             compchoice = "Rock";
        }else if (computerchoice == 2)
        {
            compchoice = "Paper";
        }else if (computerchoice == 3){
            compchoice = "Scissor";
        }


         cout << "Computer has chose : " << compchoice << endl;
        

    // Bandingin Kalo hasilnya Seri
    if(plrchoice == "Rock" && compchoice == "Rock"){
        cout << "Seri bang" << endl;
    }else if(plrchoice == "Paper" && compchoice == "Paper"){
        cout << "Seri bang" << endl;

    }else if(plrchoice == "Scissor" && compchoice == "Scissor"){
        cout << "Seri bang" << endl;
    }





    

    return 0 ;
}