public class Lesson17_String_Password {
    

    public static void main(String[] args) {


        // String kombinasi1 = "ABCDEfghijklmn123+_)*";
        String kombinasi2 = "ABCDEfghijklmn123+_)*<>";

        String password = kombinasi2;

        char karakter ;


        int lowCase = 0, Upcase = 0, digit = 0, special = 0;
        
        System.out.println("Password Rule : ");
        System.out.println("1. Should be at least 7 letters");

        System.out.println(" 2. Should contain at least 1 Lowercase");
        System.out.println(" 3. Should contain at least 1 Uppercase");
        System.out.println(" 3. Should contain at least 1 Digit(0-9)");


        int passwordLen = password.length();

        if (passwordLen < 8) {
            System.out.println("Password is not long enaugh ");
        }
        else{
            System.out.println("password long enaugh");


            for (int i = 0; i < passwordLen; i++) {
                karakter =  password.charAt(i);
                System.out.println(karakter);
    
                if (Character.isUpperCase(karakter)){
                    Upcase ++;
                    System.out.println("This IS Uppercase");
    
                }
                else if (Character.isLowerCase(karakter)) {
                    lowCase ++;
                }
                else if (Character.isDigit(karakter)){
                    digit ++;
                }
                else{
                    special ++;
    
    
                    if (karakter == '<' | karakter == '>') {
                        System.out.println("This is Berbahaya");
                        return;
                    }
                }
    
            }
        }




        System.out.println("Uppercase : " + Upcase);
        System.out.println("lowCase : " + lowCase);
        System.out.println("digit : " + digit);
        System.out.println("Special " + special);

        

        if (Upcase != 0 && lowCase != 0 && digit != 0 && special != 0){

            System.out.println("The password valid");


            if (passwordLen > 12){
                System.out.println("Password is strong");
            }
            else{
                System.out.println("password is not long enaugh");
            }


        }
        else{

            System.out.println("The Password is invalid");


            if (Upcase == 0) {
                System.out.println("PLease insert at least 1 uppercase");
            }
            
            if (lowCase == 0) {
                System.out.println("PLease insert at least 1 lowercase");
            }
            
            if (digit == 0) {
                System.out.println("PLease insert at least 1 digit");
            }
            
            if (special == 0) {
                System.out.println("PLease insert at least 1 special character");
            }
        }
        

    }


}
