#include <iostream>
using namespace std;

int main()
{
    int numStudents = 3;
    string studentNames[numStudents];
    float studentMarks[numStudents];

    studentNames[0] = "Abud";
    studentNames[1] = "Budi";
    studentNames[2] = "Cuti";


    studentMarks[0] = 80;
    studentMarks[1] = 85;
    studentMarks[2] = 100;

    cout << studentNames << endl;


    cout << "\nInformation for each student: " << endl;

    for ( int i = 0; i < numStudents ; i++)
    {
        cout << studentNames[i] << " With mark : " << studentMarks[i]<< endl;
    }
    












    return 0;
}
