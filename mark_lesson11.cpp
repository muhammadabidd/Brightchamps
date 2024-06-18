#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    string name;
    string address;

    int pizza1;
    int pizza2;
    int pizza3;

    int discounted_price;


    cout<< "insert your name :" << endl;
    cin >> name ;

    cout<< "insert \n your \n address :" << endl;
    cin >> address ;


    cout << "\n\nChoose any distict Pizza from the following Exclusive list : "<<endl;
    cout<<"Margherita Pizza	Rs.199/	\nCheese n Corn Pizza	Rs.309/- \nCheese n Tomato Pizza Rs.309/- \nDouble Cheese Margherita Pizza	Rs.339/- \nFresh Veggie Pizza	Rs.339/- \nFarmhouse Pizza	 Rs.399/- \nPeppy Paneer Pizza	Rs.399/- \nVeggie Paradise PizzaRs.399/- \nVeg Extravaganza Pizza Rs.459/-	\nCheese Dominator Pizza	Rs.579/-"<<endl;

    cout << "\nEnter Rate of Pizza-1 : ";
    cin >> pizza1;

    cout << "\nEnter Rate of Pizza-2 : ";
    cin >> pizza2;

    cout << "\nEnter Rate of Pizza-3 : ";
    cin >> pizza3;


    if(pizza1 > pizza2   &&   pizza1 > pizza3 ){
        cout << "Pizza 1 is the most expensive"<< endl;

        discounted_price = pizza1 * 0.5 + 0.25 * (pizza2 + pizza3);

    }
    else if (pizza2 > pizza1   &&   pizza2 > pizza3){
        cout << "Pizza 2 is the most expensive"<< endl;

        discounted_price = pizza2 * 0.5 + 0.25 * (pizza1 + pizza3);
    }else{
         cout << "Pizza 3 is the most expensive"<< endl;
         discounted_price = pizza3 * 0.5 + 0.25 * (pizza2 + pizza1);
    }


cout<< discounted_price << endl;







    return 0;
}
