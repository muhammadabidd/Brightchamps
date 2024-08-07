#include <iostream>

using namespace std;


int main() {

    string password;
    string username;

    int percobaan = 0;


    

    do{
        percobaan = percobaan + 1;
        cout << "please insert your username" << endl;
        cin >> username;


        cout << "PLease insert your password" << endl; 
        cin >> password;




        if (username == "USER" && password == "PASS"){
            cout << "username Corrent" << endl;
        }else{
            cout << "Incorrect passowrd" << endl;
        }

        cout << "total percobaan " << percobaan << endl;
    }while(percobaan < 3);





    // do{
    //     cout << something << endl;
    //     something++;
    // }
    // while (something < 5);




return 0;
}