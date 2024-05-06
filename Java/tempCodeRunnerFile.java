public class Lesson17_String_Password {
    

    public static void main(String[] args) {

        String password = "ABCDEFGHIJKLMN";
        char karakter ;
        
        System.out.println("Password Rule : ");
        System.out.println("Should at least 7 letters");


        int passwordLen = password.length();

        if (passwordLen < 8) {
            System.out.println("Password is not longth enought");
        }
        else{
            System.out.println("password long enaught");
        }


        for (int i = 0; i < passwordLen; i++) {
            karakter =  password.charAt(i);
            System.out.println(karakter);

        }




    }


}
