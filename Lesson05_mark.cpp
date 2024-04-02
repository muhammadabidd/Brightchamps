#include <iostream>

using namespace std;

int main(){


    int a = 12;
    int b = 4 ;

    

    cout << "The value of A is : " << a << endl;
    cout << "The value of B is : " << b << endl;


    cout << "ARTIMATHIC OPERATOR" <<   endl;
    cout << "a + b = " << a + b << endl;

    cout << "The value after increment :"<< ++a <<endl;  // a = a + 1
    b = b + 1;
    cout << "Its the same as b = b + 1 = "<< b <<  endl;




   cout << "COMPARISON OPERATOR" <<   endl;
   cout << "a > b is : "<< (a > b) << endl;
   cout << "a => b is : "<< (a >= b) << endl;   // 1 is true, 0 is false




    return 0;
}
