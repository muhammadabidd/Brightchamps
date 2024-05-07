#include <iostream>

using namespace std;


//A Pizza Hut outlet on the occasion of its 5th annual day decides to offer a reasonable discount on any order that consists of three distinct pizzas 
//from the exclusive category made by its customers.
//The food outlet wanted to send customised offer messages as texts and emails to its customers thereby offering a discount of :
// 50% on the pizza with highest price.
// Along with 25% discount on the remaining two. 
//Write a program in C++ to build an automatic system for Pizza Hut outlet to send customised messages based on the discount offered to the customer. 

int main(){

    string name;
    string address;

    float pizza1;
    float pizza2;
    float pizza3;
    float discounted_offer;
    float previous_price;
    float discounted_price;


    
    cout << "Type your first name: ";
    cin >> name; 
    cout << "Enter your address : ";
    cin >> address;

    cout << "\n\nChoose any distict Pizza from the following Exclusive list : "<<endl;
    cout<<"Margherita Pizza	Rs.199/	\nCheese n Corn Pizza	Rs.309/- \nCheese n Tomato Pizza Rs.309/- \nDouble Cheese Margherita Pizza	Rs.339/- \nFresh Veggie Pizza	Rs.339/- \nFarmhouse Pizza	 Rs.399/- \nPeppy Paneer Pizza	Rs.399/- \nVeggie Paradise PizzaRs.399/- \nVeg Extravaganza Pizza Rs.459/-	\nCheese Dominator Pizza	Rs.579/-"<<endl;

    cout << "\nEnter Rate of Pizza-1 : ";
    cin >> pizza1;

    cout << "\nEnter Rate of Pizza-2 : ";
    cin >> pizza2;
    
    cout << "\nEnter Rate of Pizza-3 : ";
    cin >> pizza3;

    if (pizza1 > pizza2 && pizza1 > pizza3){
        cout << "pizza1 is the highest price" <<endl;
        
        discounted_offer = (pizza1 * 0.5) + ((pizza2 + pizza3) * 0.25);
    }
    else if (pizza2 > pizza1 && pizza2 > pizza3){
        cout << "pizza2 is the highest price" <<endl;

        discounted_offer = (pizza2 * 0.5) + ((pizza1 + pizza3) * 0.25);
    }
    else{
        cout << "pizza3 is the highest price" <<endl;

        discounted_offer = (pizza3 * 0.5) + ((pizza2 + pizza1) * 0.25);
    }
    

    previous_price = pizza1 + pizza2 + pizza3 ;

    discounted_price = previous_price - discounted_offer;

  cout << "\n Hello " <<name<< "! We are incredibly grateful that you have been a consistent customer over the years. ";
  
  cout << "\n We would like to share our joy and love with you on the occasion of our fifth anniversary celebration by giving you a great discount in each bite you have!!";
  cout<< "\n Your Total Price: " <<previous_price<<"" ;
  cout<< "\n Your Total discount : " <<discounted_offer<<"";
  cout<<"\n Your Total Price after discounts : " <<discounted_price<<"";

  




    return 0;
}