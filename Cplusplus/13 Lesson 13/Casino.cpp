#include <iostream>

using namespace std;


int main() {


    int age, start;
    string playername;
    int dataplayer[2];
    int playerscore;

    cout<<"enter your age"<<endl;
    cin>>age;

    if(age >= 18){
        cout << "You are allowed to play the game"<< endl;

        cout<<"In what name would you like to play"<<endl;
        cin>>playername;// get the player name

        cout<<"Dear "<<playername<<" welcome to playjack cards game"<<endl;

        cout<<"\n If you want to continue please press 1 else press 0"<<endl;
        cin>>start;//getting the consent to start the game

        if(start == 1){
            cout << "Lets Play the game"<< endl;


            dataplayer[0] = rand()%12;
            dataplayer[1] = rand()%12;


            cout << dataplayer[0] << endl;
            cout << dataplayer[1] << endl;

            playerscore = dataplayer[0] + dataplayer[1];

            




           
         
        

       
            






        }
        else{
            cout << "Too bad, see you later" << endl;
        }






    }else{
        cout << "Sorry kids, youre not allowed here" << endl;
    }


    return 0 ;
}