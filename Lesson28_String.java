public class Lesson28_String {
    public static void main(String[] args) {
        
        String myletter = "Hello";

        System.out.println(myletter);

        for (int j = 0; j < myletter.length() + 1; j++) {
            
            for (int i = 0; i < j; i++) {
                System.out.print(myletter.charAt(i));
            }
            System.out.println();
        }


        System.out.println("--------");

        for (int j = 0; j < myletter.length() + 1; j++) {

            for (int i = 0; i < myletter.length() - j ; i++) {
                System.out.print(" ");
            }


            for (int i = 0; i < j; i++) {
                System.out.print(myletter.charAt(i));
            }
            System.out.println();
        }

        System.out.println("--------");
        for (int j = myletter.length() ; j > 0; j--) {
        

            for (int i = 0; i < j; i++) {
                System.out.print(myletter.charAt(i));
            }
            System.out.println();
        }

    }
}
