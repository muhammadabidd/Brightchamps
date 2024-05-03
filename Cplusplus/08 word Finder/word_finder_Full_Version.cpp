#include <iostream>
#include<string>
using namespace std;

int main() {
    string record="rakesh join brightchamps in 2020 and achieved the certificate for advanced course for junior course";
    string wordfind, replaceword,confirm;
    int position ,number;
    
    cout<<"please enter the word you want to search in record"<<endl;
    cin>>wordfind;
    position=record.find(wordfind);
    
    if ( position!=-1){
        cout<<" Yes "<<wordfind<<" found at index:"<<position<<endl;
        cout<<"do want to replace it :(yes or no)"<<endl;
        cin>>confirm;
        if (confirm=="yes" ){
            cout<<" please enter the word you want to replace with :";
            cin>>replaceword;
            cout<<" how many character you want to replace must >= to "<<wordfind.length()<<endl;
            cin>>number;
            record.replace(position,number,replaceword);
            cout<<" word replaced succesfully"<<endl;
            cout<<"updated record is :"<<record<<endl;
        }
        else{
            cout<<" old record is: "<<record;
        }
    } 
    else{
        cout<<" No "<<wordfind<<" not found"<<endl;
    }
    
    
}