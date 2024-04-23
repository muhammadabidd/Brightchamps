#include <iostream>
using namespace std;

int main(){

    bool isLeapYear ;
    int year = 2024;

    /*A year is considered as Leap year if it satisfies the below conditions.
    Condition 1 : If a year is divisible by 4, it is a leap year.
    Condition 2 :However, if that year is also divisible by 100, it is not a leap year, unless,
    Condition 3 :If a year is divisible by 400, it is still a leap year*/

    isLeapYear = ((year % 100 != 0) & (year % 4 == 0 )) | (year % 400 == 0);

    if(isLeapYear){
        cout << "This is leap year"<< endl;
        
    }
    else{
        cout << "This is not leap year" << endl;
    }




    return 0;
}

