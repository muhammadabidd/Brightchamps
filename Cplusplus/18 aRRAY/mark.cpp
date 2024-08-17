#include <iostream>
using namespace std;

int main()
{
    // int scoreA = 90;
    // int scoreB = 80;
    // int scoreC = 99;
    // int scoreD = 80;
    // int scoreE = 88;


    // int total = scoreA + scoreB + scoreC + scoreD + scoreE;

    // double average = total/5;

    // cout << average << endl; 


    int studentScore[] = {99, 87, 88, 55, 77};

    for(int number = 0; number < 5; number ++){
        cout << studentScore[number] << endl;
    }

    cout << "------------" << endl;

    studentScore[3] = 80;
    for(int number = 0; number < 5; number ++){
        cout << studentScore[number] << endl;
    }





















    return 0;
}