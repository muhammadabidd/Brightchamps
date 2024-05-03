#include <iostream>
using namespace std;


int main() {
    string long_text = "mark join brightchamps in 2020 and achieved the certificate for advanced course for junior course";
    string wordfind;
    int position;

    cout << "please  enter the word you want to find in the record : " << endl;
    cin >> wordfind ;

    position = long_text.find(wordfind);
    cout <<  position << endl;


    if (position != -1){
        cout << "ITs on " << position << endl;
    }
    else{
        cout << "CANT FIND IT" << endl;
    }



    return 0;
}