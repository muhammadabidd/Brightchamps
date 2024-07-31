#include <iostream>

using namespace std;


int main() {



    // cout << "factorial of 5!" << endl;
    // cout << 5 * 4 * 3 * 2 * 1 << endl;

    int factorial = 8 ;
    int total = 1;

    for(int bakso = factorial ; bakso >0 ; bakso--){
        cout << bakso << endl;
        total = total * bakso;
    }

    cout << total << endl;

    
    

    return 0 ;
}