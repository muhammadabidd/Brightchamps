import java.util.Scanner;

public class Lesson10_Function {

    // Static function : cannot called without generating object
    public static void sum(int a, int b){
        System.out.println("The Sum is : " + (a + b));
    }

    public static void min(int a, int b){
        System.out.println("The substraction is : " + (a - b));
    }
    
    public static void sum2(int number){

        double total = 0;
        for (int i = 1; i < number; i++) {
            total = total + ((double) 1/i);
            System.out.println(total);
        }
    }


    // non static object : need to create the object first
    public void multiply(int a, int b){
        System.out.println("The result of multiplication is : " + (a * b));
    }





    public static void main(String[] args) {

        sum(12, 13);
        min(12, 20);
        

        Lesson10_Function ujangobject = new Lesson10_Function();
        ujangobject.multiply(12, 10);


        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Your Number");
        sum2(sc.nextInt());

        sc.close();
        
    }
}
