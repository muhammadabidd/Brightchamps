#include <iostream>

using namespace std;


int main()
{

    string nama;
    double mathScore;
    double CodingScore, EnglishScore, ScienceScore;
    double total;

    double average;
    bool passedUni;

    cout << "Welcome to school verification"<< endl;

    cout << "Please insert yourname : "<< endl;

    cin >> nama;

    cout << "So " << nama << " Plese insert your math score: " << endl;

    cin >> mathScore;

    

    cout << "How About your coding, english, and science ? " << endl;

    cin >> CodingScore >> EnglishScore >> ScienceScore;

    cout << "So Your Math Score : " << mathScore << endl;
    cout << "So Your Coding Score : " << CodingScore << endl;
    cout << "So Your English Score : " << EnglishScore << endl;
    cout << "So Your Science Score : " << ScienceScore << endl;


    total = mathScore + CodingScore + EnglishScore + ScienceScore;

    cout << "Your total score is : "<< total << endl;


    average = total/4;


    cout << "with average  : "<< average << " %" << endl;

    // bulat(int) atau desimal(double); 

    passedUni = (average >= 80) and (mathScore > 70);

    if (passedUni){
        cout << "CONGRATULATION" << endl;
    }
    else {
        cout << "HAHAHA" << endl;
    }






    return 0;
}
