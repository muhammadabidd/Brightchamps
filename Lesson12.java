import java.util.Scanner;

class Akun_bank{
    int nomorID;
    String namaPemilikAkun;
    int saldo;
    String gradekartu;


    public void  masukkanData(int nomor, String nama, int balance, String grade){
        nomorID = nomor;
        namaPemilikAkun = nama;
        saldo = balance;
        gradekartu = grade;

    }

    public void ceksaldo(){
            System.out.println("Your current balance is : " + saldo);
    }

    public void ambilduit (int ambil){
        saldo = saldo - ambil;

        System.out.println("Saldo anda sekarang menjadi : " + saldo);
    }



    public void tambahsaldo ( int tambahan ){
        saldo = saldo + tambahan;

        System.out.println("Saldo anda sekarang menjadi : " + saldo);
    }


}





public class Lesson12 {
    

    public static void main(String[] args) {
        Scanner pembaca = new Scanner(System.in);



        System.out.println("Nama Saya Muhammad Abid");

        Akun_bank akun1 = new Akun_bank();
        Akun_bank akun2 = new Akun_bank();


        akun1.masukkanData(1, "Ujang", 200000, "Silver");
        akun2.masukkanData(2, "Budi", 1000000, "Gold");

        


        
        System.out.println("AKUN KE 1 -----------------");
        System.out.println(akun1.nomorID);
        System.out.println(akun1.namaPemilikAkun);
        System.out.println(akun1.saldo);

        akun1.tambahsaldo(10000);
        akun1.ceksaldo();


        System.out.println("AKUN KE 2 -----------------");
        System.out.println(akun2.nomorID);
        System.out.println(akun2.namaPemilikAkun);
        System.out.println(akun2.saldo);




        System.out.println("Plese chose between 1 - 4");
        System.out.println("1. Cek saldo");
        System.out.println("2. Tambah Saldo");
        System.out.println("3. Ambil Duit");
        System.out.println("4. Close");



        while (true) {

            int pilihan;

            pilihan = pembaca.nextInt();

            if (pilihan == 4){
                break;
            }

            if (pilihan == 1){
                akun1.ceksaldo();
            }

            if (pilihan == 2){
                akun1.tambahsaldo(10000);
            }

            if (pilihan == 3){
                akun1.ambilduit(10000);
            }

            




        }

        pembaca.close();




    }



}
