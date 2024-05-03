import java.util.Scanner;

public class Lesson16_Math_GuessNumber02 {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        
        int number = (int) (Math.random() * 100);
        
        
        int guess, count=1;

        System.out.println("I'm thinking a number. Can you guess it?");

        do {
            
            System.out.print("Your guess: ");
            guess = stdIn.nextInt();

            if (guess == number)
                System.out.println("**CORRECT**");

            else if (guess<number) {
                System.out.println("Your guess is too small");
                count++;
            }

            else {
                System.out.println("Your guess is too big");
                count++;
            }
            
        } 
        
        while (guess != number);

        System.out.println("You found it in " + count + " tries");

        stdIn.close();
    }
}