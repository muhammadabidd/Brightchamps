#include <iostream>
using namespace std;

int main (){

    int Myint = 5;
    float Myfloat = 9.8;
    double Mydouble = 9.9;
    char MyChar = 'A';
    bool MyBool = true;
    string MyString = "This is Text";


    cout << Myint<<" with the size of "<< sizeof(Myint)<< "Byte"<< endl;
    cout << Myfloat<<" with the size of "<< sizeof(Myfloat)<< "Byte"<< endl;
    cout << Mydouble<<" with the size of "<< sizeof(Mydouble)<< "Byte"<< endl;
    cout << MyChar<<" with the size of "<< sizeof(MyChar)<< "Byte"<< endl;
    cout << MyBool<<" with the size of "<< sizeof(MyBool)<< "Byte"<< endl;
    cout << MyString<<" with the size of "<< sizeof(MyString)<< "Byte"<< endl;
    

    return 0;
}