import java.util.Scanner;

public class Lesson12_Arsya_Math {
    
    public static void main(String[] args) {


        // int nomorpertama = 12;
        // int nomorkedua = 4;

        // System.out.println("Angka yang paling bsar diantara kedua ini adalah : " + Math.max(nomorpertama, nomorkedua));


        // System.out.println("Nilai paling kecil dari kedua angka tersebut adalah " + Math.min(nomorpertama, nomorkedua));


        // System.out.println("pangkat dari angka tersebut adalah :" + Math.pow(nomorpertama, nomorkedua) );



        // System.out.println("ini adalah akarpangkat dua dari 81 = " + Math.sqrt(81));



        // System.out.println(Math.ceil(8.7481274817));
        // System.out.println(Math.floor(8.782376482763));




        System.out.println("Ini adalah cara untuk mencari angka randdom di JAWA");

        int ANGKARANDOM = (int) Math.floor(Math.random() * 100);
        System.out.println(ANGKARANDOM );


        System.out.println("Silahkan tebak angka tersebut");

        Scanner pembaca = new Scanner(System.in);

        int angkatebakan = pembaca.nextInt();

        System.out.println("Angka asli : " + ANGKARANDOM);
        System.out.println("Angka tebakan anda : " + angkatebakan);


        pembaca.close();
        
    }


}
