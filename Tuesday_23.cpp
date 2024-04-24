#include <iostream>

using namespace std;


int main(){

    int umur ;


    cout << "How old are you?"<< endl;
    cin >> umur;
    if(umur >= 17){
        cout<< "You are elligble to drive in the road"<<endl;
    }
    else if(umur >= 15){
        cout << "ALMOST ELLIGIBLE"<<endl;
    }
    else {
        cout << "You are not elligible to drive "<<endl;
    }







    







    return 0;
}