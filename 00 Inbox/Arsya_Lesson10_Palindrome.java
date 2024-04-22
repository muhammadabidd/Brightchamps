public class Arsya_Lesson10_Palindrome {
    




    public static void main(String[] args) {
     

        if(cekpalindrome("KASURRUSAK")){
            System.out.println("INI PALINDROME");
        }
        else{
            System.out.println("Ini Bukan Palyndrome");
        }

    }



    public static boolean cekpalindrome(String nama){
        String text = nama;
        String maudicek = "";

        for (int i = text.length() - 1; i >= 0; i--) {
     

            maudicek = maudicek + text.charAt(i);
            System.out.println(maudicek);
        }

        if(text.equalsIgnoreCase(maudicek)){
            System.out.println("SAMA SETELAH DIBALIK");

            return true;
        }
        else{
            System.out.println("TEXTNYA BEDA");
            return false;
        }


        
    }












}
