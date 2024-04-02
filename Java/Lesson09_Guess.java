import java.util.Scanner;

public class Lesson09_Guess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number = (int) (Math.random() * 100);
        System.out.println(number);
        int guess;
        int percobaan = 0;

        do {
            guess = sc.nextInt();

            // if (guess == number) {
            //     System.out.println("Correct ****************");
            // }

            if(guess < number){
                System.out.println("The Number is too small, Try Bigger Number");
            }
            else{
                System.out.println("The number is too big, try Smaller Number");
            }
            percobaan++;

            
        } while (number != guess);

        System.out.println("Correcttttt ***********");

        System.out.println("You manage to answer by " + percobaan + ((percobaan == 1) ? " guess" : " guesses"));





        sc.close();
    }
}
