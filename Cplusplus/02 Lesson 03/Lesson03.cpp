#include <iostream>

using namespace std;

int main() 
{
    //variables-you will learn about it in next sessions
    string fullname;
    string goal;
    int age;
    string sport;
    string subject,subject1;
    float mark;

    //Input: Get student information
    cout<< "Welcome Back to School!"<< endl;
    cout<<"--------------------------"<< endl;
    cout<<"Student Survey Form "<< endl;
    cout<<"Enter your name: ";
    getline(cin,fullname);
    
    cout<<"Enter your age: ";
    cin>>age;
    
    cout<<"Enter your Favourite Sport/Hobby: ";
    cin>>sport;
    
    //taking multiple inputs
    cout<<"Enter your Favourite Subject and least Favourite Subject: ";
    cin>>subject>>subject1; 
    cout<<"Enter your mark for "<<subject<<": ";//ask the student to enter the mark with decimal values
    cin>>mark;
    
    cin.ignore(); //Eliminates the new line in input buffer
    cout<<"Enter your Goal: ";
    getline(cin,goal);


    //Output: Display student information
    cout<< "\nStudent Information"<< endl;
    cout<<"------------------------"<< endl;
    cout<< "Name: "<< fullname << endl;
    cout<< "Age: "<< age << endl;
    cout<< "Favourite Sport/Hobby: "<< sport << endl;
    cout<< "Favourite Subject: "<< subject << endl;
    cout<< subject <<" score : "<< mark <<"%"<< endl;
    cout<< "Least Favourite Subject: "<< subject1 << endl;
    cout<< "Goal : "<< goal << endl;

    return 0;
}