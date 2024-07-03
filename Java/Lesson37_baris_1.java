import java.util.Scanner;

public class Lesson37_baris_1 {


    static double sum_series(int number){

        double sum = 0.0;

        for (int i = 1; i <= number; i++) {

            sum = sum + 1.0/i;
            // System.out.println(sum);
            
            if (i == 1) {
                System.out.print("1/"+i);
            }
            else{
                System.out.print(" + 1/"+i);
            }

        }
        
        // System.out.print(" = " + sum);

        return sum;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.printf("\n \nSum is %f", sum_series(n));
        // sum_series(n);
    }
    
}
