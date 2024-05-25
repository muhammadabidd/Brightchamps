/**
 * Lesson17_Arsya_String
 */
public class Lesson17_Arsya_String {

    public static void main(String[] args) {
        

        String password = "Abcdefgh";
        int panjang_Password = password.length();
        int jumlahHurufKecil = 0;
        int jumlahHurufBesar = 0;

        System.out.println("This is the rule of the password : ");
        System.out.println("Rule Number 1 : need to be at least 8 Character");
        System.out.println("Minimal ada 1 huruf kecil");
        System.out.println("minimal ada 1 huruf besar");




        if(panjang_Password >= 8){
            System.out.println("Password is valid");

            for (int i = 0; i < panjang_Password; i++) {
                char karakter = password.charAt(i);

                System.out.println(karakter);

                

                if (Character.isUpperCase(karakter)){
                    System.out.println("INI HADALAH HURUF BESAR");
                    jumlahHurufBesar += 1;
                }
                if (Character.isLowerCase(karakter)){
                    System.out.println("INI HADALAH HURUF Kecil");
                    jumlahHurufKecil += 1;
                }


            }

            System.out.println("ADA HURUF BESAR SEBANYAK : " + jumlahHurufBesar);
            System.out.println("ADA HURUF KECIL SEBANYAK "+ jumlahHurufKecil);

        }
        else{
            System.out.println("Passowrd is invalid, put at least 8 character");
        }







    }
    



}