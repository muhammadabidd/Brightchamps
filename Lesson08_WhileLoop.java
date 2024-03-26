import java.util.Scanner;

public class Lesson08_WhileLoop {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Input Your Favorite Number to see if it Armstrong Number or not");
    int yournum = s.nextInt();
    int temp = yournum;
    int thesum = 0;
    int cube = 0;

    while (temp > 0) {
        int last_digit = temp % 10;
        cube = last_digit * last_digit * last_digit;
        temp = temp / 10;
        thesum = thesum + cube;
    }




    if (thesum == yournum) {
        System.out.println("This is Armstrong Number");  
    } 
    else{
        System.out.println("This is not Armstrong Number");
    }

    s.close();

    }
}
