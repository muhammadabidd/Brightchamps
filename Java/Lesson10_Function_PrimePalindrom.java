public class Lesson10_Function_PrimePalindrom {
    public static void main(String[] args) {
        
        int batasbawah = 100;
        int batasatas = 200;


        for (int i = batasbawah; i < batasatas; i++) {
            if(CheckPalindromeNumber(i) && CheckPrime(i)){
                System.out.println(i + " is PrimePalindrome");
            }
            else {
                System.out.println(i + " is NOT PrimePalindrome");
            }
        }


    }   





    // FIRST FUNCTION
    public static boolean CheckPrime(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            // System.out.println(i);

            if (number % i == 0){
                count++;
            }
        }


        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }




    // SECOND FUNCTION
    public static boolean CheckPalindromeNumber( int number){
        
        int sementara = number;
        int reverse = 0;
        int lastDigit;


        while (sementara > 0){
            lastDigit = sementara % 10;
            reverse = reverse* 10 + lastDigit;
            sementara = sementara / 10;

            // System.out.println(reverse);
        }


        if (reverse == number) {
            return true;
        }
        else{
            return false;
        }
        
    
    }
}
