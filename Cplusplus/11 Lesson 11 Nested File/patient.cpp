// Write a program for the hospital authority  to register the information of patient based on:
// Disease whether it communicable or non-communicable.
// Disease particular name 
// Age whether patient is minor or adult .
// Earlier covered in any insurance scheme or not.

// Recorded must contain all these information along with name and city of the patient .  
// Note:patient age less 18 provide insurance from govt side.

// use multiple and nested condition in your c++ programme to record patient record for the authority.



#include <iostream>

using namespace std;

int main(){

   string name, city, diseasetype, disease, insurance;
   int age;

   cout<<"hello and welcome to City Hospital "<<endl;
   cout<<"\nplease enter patient name : ";
   cin>>name;


   cout<<"\nplease enter city name : ";
   cin>>city;
   
   cout<<" \nplease enter the age of patient: ";
   cin>>age;


    if (age >= 18){
       cout<<" \nwelcome to general ward for adults"<<endl;
       cout<<" \nwhich type of disease patient had communicable or noncommunicable"<<endl;
       cin >> diseasetype;

       if(diseasetype == "communicable"){
           cout<<"Please select disease from : \nCommon Cold \nStomachFlu \nChickenpox  \nhepatitis  "<<endl;
           cin>>disease;

           cout<<" do you have any insurance ( yes /no ) : ";
           cin>>insurance;
           if (insurance=="yes"){
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Available";
           }
           else{
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Not Available";
           }
       }
       else{
           cout<<"Please select disease from : \nDiabetes \nCardiovascular \nRespiratory \nCancer  "<<endl;
           cin>>disease;

           cout<<" do you have any insurance ( yes /no ) : ";
           cin>>insurance;
           if (insurance=="yes"){
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Available";
           }
           else{
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Not Available";
           }
       }


    }
    else{
       cout<<"\n welcome to Child care center"<<endl;
       cout<<"\n which type of disease patient had communicable or noncommunicable"<<endl;
       cin >> diseasetype;

        if(diseasetype == "communicable"){
           cout<<"Please select disease from : \nCommon Cold \nStomachFlu \nChickenpox  \nhepatitis  "<<endl;
           cin>>disease;

           cout<<" do you have any insurance ( yes /no ) : ";
           cin>>insurance;
           if (insurance=="yes"){
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Available";
           }
           else{
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Not Available";
           }
       }
       else{
           cout<<"Please select disease from : \nDiabetes \nCardiovascular \nRespiratory \nCancer  "<<endl;
           cin>>disease;

           cout<<" do you have any insurance ( yes /no ) : ";
           cin>>insurance;
           if (insurance=="yes"){
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Available";
           }
           else{
               cout<< " patient Name : "<<name<<"\nAge : "<<age<<"\n Disease Name : "<<disease<<"\nCity : "<<city<<endl;
               cout<<" Insurance status : Automatic available from goverment";
           }
       }

    }


    return 0;
}