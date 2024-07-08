public class Arsya_lesson37_1 {
    public static void main(String[] args) {
        
        int angka = 5;
        double jumlah = 0.0;     //double itu untuk angka koma komaan


        for (int i = 1; i <= angka; i++) {
            System.out.print(1 + "/" + i + " + ");
            // System.out.print(i + " + ");

            jumlah = jumlah + 1.0/i;

        }

        System.out.println(" = " + jumlah);




    }
    
}
