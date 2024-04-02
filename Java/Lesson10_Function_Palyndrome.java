public class Lesson10_Function_Palyndrome {
    public static void main(String[] args) {
        
        String tebakan = "MOM";
    
        if (CheckBoolean(tebakan)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


    }


    public static boolean CheckBoolean(String text){
        System.out.println(text);

        String maudicek = "";

        for (int i = text.length()-1; i >= 0; i--) {
            // System.out.println(i);
            // System.out.println(text.charAt(i));
            maudicek = maudicek + text.charAt(i);
        }

        System.out.println(maudicek);

        if (text.equalsIgnoreCase(maudicek)) {
            return true;
        }
        else{
            return false;
        }



    }
}
