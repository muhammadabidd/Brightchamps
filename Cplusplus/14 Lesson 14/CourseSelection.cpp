#include <iostream>

using namespace std;
// Seorang anak mau daftar kursus. nilai rata rata dia di sekolah (percentage), nilai komputer.
// Coursenya : Java, C++, Python, HTML CSS, Javascript.

int main() {

    float computer ; 
    float percentage ;
    int chose;


    cout << "Please insert your computer score : " << endl;
    cin >> computer;

    cout << "Please insert your percentage score : " << endl;
    cin >> percentage;


    cout << "so, which course are you interested in?" << endl;
    cout << "Press 1 to choose C++" << endl;   // > 90
    cout << "Press 2 to choose Java" << endl;  // 80 - 90
    cout << "Press 3 to choose JavaScript" << endl; // 70 - 80
    cout << "Press 4 to choose Python" << endl; // 60 - 70
    cout << "Press 5 to choose HTML" << endl; // 50 - 60

    cout << "Press 6 to Exit" << endl;

    cin >> chose;



    switch (chose) {
        case 1 :{
            cout << "You Choose C++" << endl;


            if (percentage > 90 && computer > 90){
                cout << "You are elligible to enroll on this course" << endl;
            }
        }
        
        case 2 :{
            cout << "You Choose Java++" << endl;
            if ((percentage > 80 && percentage < 90) && (computer > 80 && computer < 90) ){
                cout << "You are elligible to enroll on this course" << endl;
            }
        }

        case 3 :{
            cout << "You Choose Java Script++" << endl;
        }

        case 4 :{
            cout << "You Choose Python++" << endl;
        }

        case 5 :{
            cout << "You Choose HTML" << endl;
        }

        case 6 :{
            cout << "Exit++" << endl;
        }

    }

    







    return 0;
}