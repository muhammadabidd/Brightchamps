public class Lesson11_RecursiveFunction {
    

    // FIRST FUNCTION
    public static int findFactorial(int number){
        if (number <= 1){
            return 1;
        }
        else{
            return number * findFactorial(number-1);
        }
    }


    //SECOND FUNCTION
    public static int sumDigits(int number){
        if (number == 0){
            return 0;
        }
        else{
            System.out.println(number);
            return number % 10 + sumDigits(number / 10);
        }
        
    }


    //Third FUNCTION
    public static int sumFibonanci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        else{
            return (sumFibonanci(number-1) + sumFibonanci(number-2));
        }
    }



    public static void main(String[] args) {
        int myNumber = 3;

        // System.out.println("The Factorial of " + myNumber + " is :");
        // System.out.println(findFactorial(myNumber));




        // System.out.println("The SUM DIGITS of " + myNumber + " is :");
        // System.out.println(sumDigits(myNumber));


        System.out.println(sumFibonanci(myNumber));
    }

}
