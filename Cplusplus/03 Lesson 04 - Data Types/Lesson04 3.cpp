#include <iostream>
using namespace std;

int main (){

 			string name;
  float age;
  int std; 
  float percentage;
  string coding_Skills;
  string email;
  string desc;
  
  cout << "Type your full name: ";
  cin >> name; 
  cout << "Enter your age: ";
  cin >> age;
  cout << "In which class are you in school?: ";
  cin >>std;
  
  cout << "Enter your total percentage : ";
  cin >> percentage; 
  
  cout << "Type your coding skills: ";
  cin >> coding_Skills; 
  
  cout << "Enter your email address : ";
  cin >> email;
  
  cout << "What inspires you about coding ? ";
  cin >> desc;
  
  
  cout << "\n\nHi, "<<name<<"Here are your registeration details :";
  cout<< " Name : "<<name<<endl;
  cout<< " Age : "<<age<<endl;
  cout<< " Class : "<<std<<endl;
  cout<< " Total Percentage  : "<<percentage<<endl;
  cout<< " Coding Skills : "<<coding_Skills<<endl;
  cout<< " Email : "<<email<<endl;
  cout<< " What inspires you about coding : "<<desc<<endl;
  
  
    




    


 

    return 0;
}