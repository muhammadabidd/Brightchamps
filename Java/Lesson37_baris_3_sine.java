// untuk menghitung rumus sin, bisa gunakan rumus tersebut 

import java.util.Scanner;




public class Lesson37_baris_3_sine {

    static double factorial(double n){

        if (n == 1 || n == 0) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }



    }



    static void calculatesinevalue(double n){

        double sum = 0 ;
        int sign = 1;

        for (int i = 1; i <= 10; i = i + 2) {
            // System.out.println(i);
            // System.out.println(factorial(i));

            System.out.println(sign+ " " + n + "^" + i + "/" + i+ "!");

            sum += (sign * Math.pow(n, i))/factorial(i);

            // System.out.println((sign * Math.pow(n, i))/factorial(i));
            sign = sign * -1;

        }
        
        System.out.println("The sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Creating Scanner object
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();             //User input for x

        // System.out.println(calculatesinevalue(x));
        calculatesinevalue(x);




    }
    
}
