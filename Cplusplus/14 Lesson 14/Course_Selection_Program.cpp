#include <iostream>

using namespace std;


int main() {

    // int angka ;

    
    // cout << "1 : Monday" << endl;
    // cout << "2 : Tuesday" << endl;
    // cout << "3 : Wednesday" << endl;
    // cout << "4 : Thursday" << endl;
    // cout << "5 : Friday" << endl;
    // cout << "6 : Saturday" << endl;
    // cout << "7 : Sunday" << endl;
    // cout << "Please insert the Day Number : " << endl;


    // cin >> angka;


    // if (angka == 1){
    //     cout << "You Chose Monday" << endl;
    // }
    // if (angka == 2){
    //     cout << "You Chose Tuesday" << endl;
    // }




    int angka ;
    cout << "1 : Monday" << endl;
    cout << "2 : Tuesday" << endl;
    cout << "3 : Wednesday" << endl;
    cout << "4 : Thursday" << endl;
    cout << "5 : Friday" << endl;
    cout << "6 : Saturday" << endl;
    cout << "7 : Sunday" << endl;
    cout << "Please insert the Day Number : " << endl;
    cin >> angka;


    switch (angka){
        case 1:{
            cout << "You Chose Monday" << endl;
        }
        case 2: {
            cout << "You Chose Tuesday" << endl;
        }
        default:{
            cout << "Yo bro, 1-7!!!!" << endl;
        }





    }



return 0;
}