import java.util.Scanner;

class  Account {

    int accountNumber;
    String accountHolderName;
    float accountBalance;

    public void insert (int acc_no, String name, float balance ){
        accountNumber = acc_no ;
        accountHolderName = name ; 
        accountBalance = balance;


    }

    public void checkBalance(){
        System.out.println();
        System.out.println("Your Balance is : " + accountBalance);
    }

    void deposit(int amount){
        accountBalance = accountBalance + amount;
        System.out.println("You have deposited "+ amount);
        System.out.println("Your Current Balance are : "+ accountBalance);
    }

    public void wihtdraw(int amount){

        if (accountBalance > amount){
            accountBalance = accountBalance - amount;
            System.out.println("You have withdraw "+ amount);
            System.out.println("Your Current Balance are : "+ accountBalance);

        }
        else{
            System.out.println("You dont have enought Balance");
        }
    }

    public void info(){
        // function to show the entire information about the account
        System.out.println();
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account ID : "+ accountNumber) ;
        System.out.println("Account Balance : " + accountBalance);
    }

}


public class Lesson12_ObjectInvocation{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        Account akun1 = new Account();

        int acc_no = 15;        
        String name = "ABID" ; 
        int balance = 15000;

        akun1.insert(acc_no, name, balance);

        // akun1.checkBalance();
        // akun1.deposit(20000);
        // akun1.checkBalance();

        // akun1.wihtdraw(9000);

        // akun1.info();

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Press 1 to check Balance ");
            System.out.println("Press 2 to Deposit ");
            System.out.println("Press 3 to Withdraw ");
            System.out.println("Press 4 to Account Information ");
            System.out.println("Press 5 to Exit ");



            System.out.println();            
            System.out.println("Please Insert your Choice : ");
            int input = scanner.nextInt();


            if (input == 5){
                break;
            }

            switch (input) {
                case 1:
                    akun1.checkBalance();
                    break;

                case 2 : 

                    akun1.deposit(10000);
                    break;

                case 3 : 
                    akun1.wihtdraw(10000);
                    break;

                case 4 : 
                    akun1.info();
                    break;
            
                default:
                    System.out.println("PLease insert the correct choice");
                    break;
            }


        }

        scanner.close();




    }

}