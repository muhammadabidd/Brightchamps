#include <iostream>

using namespace std;

int main() {
    string name;
    double score1, score2, score3;
    double total_marks, averageMarks;
    bool haspassed;
    const double tresholds = 70.0;



    cout << "Hello Welcome, " << endl;

    cout << "Please insert your name :" << endl;
    cin >> name;

    cout << "Please insert your math, english, and science score"<< endl;
    cin >> score1 >> score2 >> score3;

    cout<< score1<< endl;
    cout<< score2<< endl;
    cout<< score3<< endl;


    total_marks = score1 + score2 + score3;
    averageMarks = total_marks/3;


    //Output results
    cout<<"\nReport card - High School Enrolment"<<endl;
    cout<<"======================================"<<endl;
    cout<<"Student Name : "<<name<<endl;
    cout<<"Mathematics: "<<score1<<" %"<<endl;
    cout<<"Sciene: "<<score2<<" %"<<endl;
    cout<<"English: "<<score3<<" %"<<endl;
    cout<<"Total Marks: "<<total_marks<< endl;
    cout<<"Average Marks-Academics: "<<averageMarks<<" %"<<endl;
    



    haspassed = (score1 >= tresholds) and (score2 >= tresholds) and (score3 >= tresholds);

    if (haspassed){
        cout << "You have passed" << endl; 
    } 
    else{
        cout << "You are not passed the test" <<endl;
    }
}