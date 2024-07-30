#include <iostream>

using namespace std;


int main() {

    int num;
    int factorial = 1;


    cout << "Type positive number: ";
	cin >> num;

    for(int i = num ; i >= 1 ; i-- ){
        // cout << i << endl;
        factorial = factorial * i;
    }
    cout << factorial << endl;


    return 0;
}