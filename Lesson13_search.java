public class Lesson13_search {

    public static void main(String[] args) {
        
        int[] nilai = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};

        // String[] namasiswa = {"Marselino", "Arsya", "Nathan", "Garnacho", "BangMessi"};

        int yangdicari = 8;

        int kiri = 0;
        int kanan = nilai.length - 1;

        while (kiri <= kanan){

            int mid = (kiri + kanan) /2 ;
    
            System.out.println(mid);
    
            for (int i = 0; i < nilai.length; i++) {
                // System.out.println(i);
                if (nilai[mid] < yangdicari){
                        kiri = mid + 1 ;
    
                }
                else {
                    kanan = mid - 1;
                }
    
    
                if (nilai[mid] == yangdicari){
                    System.out.println("ketemu deh" + mid);
                    break;
                }
    
    
            }
        }




    }
    
}
