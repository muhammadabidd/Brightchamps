public class arsya_lesson37_part2 {

    public static int factorial(int N){

        int jumlah = 1;

        for (int i = N; i >= 1; i--) {
            jumlah = jumlah * i;
        }
        
        return jumlah;
    }



    public static void main(String[] args) {
            int angka = 5;


            System.out.println(factorial(angka));


    }
}
