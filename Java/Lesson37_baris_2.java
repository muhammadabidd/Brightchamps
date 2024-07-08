//Find sum of factorials till N factorial (1! + 2! + 3! + … + N!)
// Make sure to to input big number, because it will be to big to handle by java.

//dibaca factorial
// 5! = 5 * 4 * 3 * 2 * 1
// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1

//angka = 4
// 1! + 2! + 3! + 4!


import java.util.Scanner;

public class Lesson37_baris_2 {


    static int factorial(int n){

        if (n == 1 || n == 0) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }



    }

    // atau juga bisa : 
    // def factorial_iterative(n):
    // result = 1
    // for i in range(1, n + 1):
    //     result *= i
    // return result

    


    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N:");

        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            sum = sum + factorial(i);

            if (i==1)
		    {
		        System.out.print("Series:\n"+i+"!");
		    }
		    else
		    {
		        System.out.print(" + "+i+"!");
		    }

            // System.err.println(factorial(i));
        }

        System.out.println("\n\nSum = "+sum);
        




    }
}
