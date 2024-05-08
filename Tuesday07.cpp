#include <iostream>

using namespace std ;


int main(){

    string my_message = "ini ini adalah sebuah text";
    int panjang_text = my_message.length();

    string wordfind;

    cout << "mau mencari text apa : "<< endl;
    cin >> wordfind;


    

    int  posisi_huruf =  my_message.find(wordfind);
    cout << "kita bisa menghitung berapa panjang teksnya dengan code : "<< endl;
    cout << "Panjang dari text ini adaah : "<< panjang_text << " Character "<< endl;


    cout << "Kita juga bisa mencari sebuah kata/huruf dalam string" << endl;
    cout << "contoh, kata ada di index : " << posisi_huruf << endl;




    return 0;
}