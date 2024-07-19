#include <iostream>
#include<unistd.h>               // for linux 

using namespace std;


int main() {

        int sesuatu = 1;
        while(sesuatu < 10){
            cout << sesuatu << endl;
            sleep( 1 );
            sesuatu = sesuatu + 1;
        }



    
}