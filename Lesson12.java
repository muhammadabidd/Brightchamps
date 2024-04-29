
class Akun_bank{
    int nomorID;
    String namaPemilikAkun;
    int saldo;


    public void  masukkanData(int nomor, String nama, int balance){
        nomorID = nomor;
        namaPemilikAkun = nama;
        saldo = balance;

    }


}





public class Lesson12 {
    

    public static void main(String[] args) {
        System.out.println("Nama Saya Muhammad Abid");

        Akun_bank akun1 = new Akun_bank();
        Akun_bank akun2 = new Akun_bank();


        akun1.masukkanData(1, "Ujang", 200000);
        akun2.masukkanData(2, "Budi", 1000000);

        


        
        System.out.println("AKUN KE 1 -----------------");
        System.out.println(akun1.nomorID);
        System.out.println(akun1.namaPemilikAkun);
        System.out.println(akun1.saldo);



        System.out.println("AKUN KE 2 -----------------");
        System.out.println(akun2.nomorID);
        System.out.println(akun2.namaPemilikAkun);
        System.out.println(akun2.saldo);




    }



}
