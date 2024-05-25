import java.util.Scanner;

/**
 * Linear_Search_Arsya
 */
public class Linear_Search_Arsya {


    public static void linearsearch( int arraynya[], int angka  ){

        int lokasi = -1;
        for (int i = 0; i < arraynya.length; i++) {
            System.out.println(arraynya[i]);

            if(arraynya[i] == angka){
                System.out.println("KETEMU");
                lokasi = i;

            }

        }

        System.out.println("lokasi ada di " + lokasi);

    }




    public static void main(String[] args) {

        Scanner pembaca = new Scanner(System.in);
        
        int[] arraysaya = {10, 11, 12, 13, 14, 15};
        int angkacari = pembaca.nextInt();



        linearsearch(arraysaya, angkacari);




    }
}