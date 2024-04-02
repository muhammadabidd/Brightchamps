#include <iostream>

using namespace std;

int main(){

    float q1, q2, q3, q4, q5;
    float total_mark, percentage;

    cout<< "insert the first score : [5 marks]" << endl;
    cin >> q1;

    cout<< "insert the second score : [5 marks]" << endl;
    cin >> q2;

    cout<< "insert the third score : [5 marks]" << endl;
    cin >> q3;

    cout<< "insert the fourth score : [5 marks]" << endl;
    cin >> q4;

    cout<< "insert the fifth score : [5 marks]" << endl;
    cin >> q5;    

    total_mark = q1 + q2 + q3 + q4 + q5;

    percentage = total_mark/30 * 100;

    cout<< "The total mark is : "<< total_mark<<endl;

    cout<<"The percentage is : " << percentage << endl;





    return 0;
}