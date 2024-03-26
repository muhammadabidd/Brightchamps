import java.util.Scanner;

public class Arsya04 {
    public static void main(String[] args) {

        Scanner pembaca = new Scanner(System.in);



        int hari;
        hari = 99;

        if (hari == 1){
            System.out.println("Senin");
        }
        else if (hari == 2) {
            System.out.println("Selasa");
        } 
        else {
            System.out.println("INPUT INVALUD");
        }


        pembaca.close();
    }
}
