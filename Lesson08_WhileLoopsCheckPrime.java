public class Lesson08_WhileLoopsCheckPrime {
    public static void main(String[] args) {


        // input your favorite number here to check:
        int yournumber = 99;
        int count = 0;
        int i = 1;

        while  (i <= yournumber){

            if (yournumber % i == 0){
                count++ ;
            }

            if (count > 2){
                break;
            }

            i++;
        }

        if (count == 1){
            System.out.println("1 is neither Decimal nor Composite Number");
        }
        else if (count == 2){
            System.out.println("Desimal Number");
        }
        else{
            System.out.println("Not Desimal Number");

        }
    }
}
