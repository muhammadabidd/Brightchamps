#include <iostream>

using namespace std;

int main() {
  
    bool isPassengerCheckedIn;
    bool isCabbinbagOverweighed;
    
    string passengername;
    string boardinggroup;
    string boardingClass;
    int seatNumber;
    
    float bagweight;
    int maximumbagweight_ec,maximunbagweight_fc_bc;
    float extra_price;
    
    cout<<"Welcome to the Airline Boarding System"<<endl;
    cout<<"--------------------------------"<<endl;
    cout<<"Enter your name: ";
    getline(cin,passengername);
    
    cout<<"Enter your seat number: ";
    cin>>seatNumber;
    
    //Check in process-Boarding group & maximum carry-on luggage weight Allotment based on seatnumber 
    if (seatNumber>=1 && seatNumber<=10) 
    {
        boardingClass="First Class";
        boardinggroup="A1";
        isPassengerCheckedIn=true;
        maximunbagweight_fc_bc=15;//Assume maximum carry-on luggage weight for first class and business class will be 15 kgs
    } 
    else if (seatNumber>=11 && seatNumber<=30)
    {
        boardingClass="Business Class";
        boardinggroup="A2";
        isPassengerCheckedIn=true;
        maximunbagweight_fc_bc=15;//Assume maximum carry-on luggage weight for first class and business class will be 15 kgs
    } 
    else if (seatNumber>=31 && seatNumber<=100) 
    {
        boardingClass="Economy Class";
        boardinggroup="A3";
        isPassengerCheckedIn=true;
        maximumbagweight_ec=7;////Assume maximum carry-on luggage weight for Economy Class will be 7 kgs
    } 
    else
    {
        isPassengerCheckedIn=false;
    }
    
    //Check Carry-on Luggage weightage depending upon class-First class/Business class/Economy Clsas
    cout<<"Enter your carry-on luggage weight in kgs: ";
    cin>>bagweight;
    
    if((boardingClass=="First Class" && bagweight<=maximunbagweight_fc_bc) || (boardingClass=="Business Class" && bagweight<=maximunbagweight_fc_bc) || (boardingClass=="Economy Class" && bagweight<=maximumbagweight_ec))
    {
        isCabbinbagOverweighed=false;
    }
    else
    {
        isCabbinbagOverweighed=true;
    }
    
    // Check passenger eligibility-Passenger can check in after booking confirmation
    if (isPassengerCheckedIn) 
    {
        cout << "You are checked in." << endl;
            
            //Display Boarding Group after passenger check in and checking carry - on Luggage weight
            if (!isCabbinbagOverweighed) 
            {
                cout << "Your carry-on luggage is within the Weight limits." << endl;
                cout<<"You can proceed to board the plane"<<endl;
                cout<<"Passenger Name : "<<passengername<<" \t Boarding Group : "<<boardinggroup<<endl;
            } 
            else 
            {
                //pay Rs 560 per kg for excess bag weightage
                if(boardingClass=="Economy Class")
                extra_price=(bagweight-maximumbagweight_ec)*560;
                else
                extra_price=(bagweight-maximunbagweight_fc_bc)*560;
                cout <<"Your carry-on luggage is overweighed. Please check it at the counter to pay the extra fare Rs: "<<extra_price << endl;
                cout<<"You can now proceed to board the plane"<<endl;
                cout<<"Passenger Name : "<<passengername<<" \t Boarding Group : "<<boardinggroup<<endl;
            }
    }
    else
    {
        cout << "You are not checked in. Please check in at the counter." << endl;
    }
    return 0;
}