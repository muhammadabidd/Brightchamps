#include <iostream>

using namespace std;


int main() {
    cout<<"Enter the number of students :"<<endl;    
    int n;
    cin>>n;

    int total = 0, highest = 0, fails = 0;

    for(int i = 1 ; i <= n;i++){
        

        cout<<"Enter the marks of student - "<<i<<" : " <<endl;
        int marks;
        cin>>marks;

        total = total + marks;
        if (marks > highest){
            highest = marks;
        }

        if(marks < 30 ){
            fails ++;
        }
    }

    cout<<"\n\nAverage percentage of the class : "<< ((total/n))<<" %"<<endl;
    cout<<"\nHighest marks achieved :"<<highest<<endl;
    cout<<"\nNumber of students who failed :"<<fails<<endl;
    cout<<"\nNumber of students who passed :"<<(n-fails)<<endl;


    return 0;
}