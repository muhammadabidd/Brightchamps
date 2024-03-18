import java.util.Scanner;

public class Lesson04_03 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of the week");
        int numweek = reader.nextInt();

        String day= "" ;

        if(numweek == 1){
            day = "Monday";
        }
        else if (numweek == 2){
            day = "Tuesday";
        }
        else if (numweek == 3){
            day = "Wed";
        }
        else if (numweek == 4){
            day = "Thursday";
        }
        else if (numweek == 5){
            day = "Fri";
        }
        else if (numweek == 6){
            day = "Sat";
        }
        else if (numweek == 7){
            day = "Sunday";
        }
        else{
            System.out.println("Wrong anak Mudaaa hahahaha");
        }

        System.out.println("This is : " + day);

        reader.close();
    }
}