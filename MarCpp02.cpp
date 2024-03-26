// #include <iostream>

// int main(){

//     std::cout << "Hello Semuanya"<< std::endl;
//     return 0;
// }


#include <iostream>
using namespace std;

int main(){

    //DATA TYPE

    // 1. STRING (untuk Text)
    // string textsaya = "Ini Adalah Text";
    // cout << textsaya << " ,dan Memory yang digunakan adalah : " << sizeof(textsaya) << " byte" << endl;
    string ketoprak = "ini adalah isinya";
    cout << ketoprak << " adalah sebuah text, memiliki memory sebesar: " << sizeof(ketoprak) << " byte" << endl;


    // 2. INTEGER (untuk angka)
    int bakso = 20;
    cout << bakso << " adalah sebuah Integer, memiliki memory sebesar: " << sizeof(bakso) << " byte" << endl;
}