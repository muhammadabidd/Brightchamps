import java.util.Scanner;

public class Lesson09_DoWhile {

    private static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int i = 1;
        int number = sc.nextInt();
        int sum = 0;

        do {
            if (number % i ==  0){
                sum = sum + i;
                System.out.println(i);
            }
            // System.out.println(i);

            // System.out.println(sum);
            i++;
        } while (i< number);


        sc.close();
    }


}