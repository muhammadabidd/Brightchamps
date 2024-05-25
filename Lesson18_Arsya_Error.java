/**
 * Lesson18_Arsya_Error
 */
public class Lesson18_Arsya_Error {

    public static void main(String[] args) {
        

        // try{
        //     int angka1 = 12;
        //     int angka2 = 0;
    
        //     System.out.println(angka1/angka2);

        // }
        // catch(ArithmeticException e){
        //         System.out.println("SALAH WOI, GABISA DIBAGI 0");
        // }

        // try {
            
        //     int[] nilaiSiswa = {90, 80, 90, 80};
    
        //     // System.out.println(nilaiSiswa[0]);
        //     // System.out.println(nilaiSiswa[1]);
        //     // System.out.println(nilaiSiswa[2]);
        //     // System.out.println(nilaiSiswa[3]);
    
    
        //     for(int i=0 ; i <= 4; i++){
        //         System.out.println(nilaiSiswa[i]);
        //     }
        // } catch(ArrayIndexOutOfBoundsException bakso){
        //     System.out.println("KAGABISA BANG");

        //     System.out.println(bakso);
        // }

        try{
            int [] nilaisiswa = {100,90,80,99};
            for(int i=0; i <= 4; i++){
            System.out.println(nilaisiswa[i]);
        }
    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        
    }
}