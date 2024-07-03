import java.util.Scanner;

public class Lesson36_DoublePrimeNumber {

    static boolean checkprime(int number){

        int index = number;
        int flag = 0;

        while (index >= 1) {

            if (number % index == 0) {
                // System.out.println("Bisa di bagi " + index );
                flag = flag + 1;
                
            }



            if (flag > 2){
                // System.out.println("Udah pasti bukan prime");
                return false;

            }

            

            index = index - 1;
            
        }
        if (flag == 2) {
            
            // System.out.println("bilangan prima");
            return true;
        }



        return true;
    }


    static boolean checkdoubleprime(int first, int second){
        if (checkprime(first) && checkprime(second)) {
            return true;
            
        }

        return false;
        

    }



    public static void main(String[] args) {
        
        int number1, number2;  
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter first number");  
        number1 = sc.nextInt();   
        System.out.println("Enter second number");  
        number2 = sc.nextInt(); 


        if (checkdoubleprime(number1, number2)) {
            System.out.println(number1 + " and " + number2 + " is a double prime");
        }else{
            System.out.println(number1 + " and " + number2 + " is NOT a double prime");
        }
    }
}
