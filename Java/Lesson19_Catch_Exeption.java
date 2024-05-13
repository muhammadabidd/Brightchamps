public class Lesson19_Catch_Exeption {
    public static void main(String[] args) {

        // FIRST LESSON
        try{
        int x=10;
        int y=0;
        System.out.println("Result of x/y = " + (x/y));

        }catch (ArithmeticException e){
        System.out.println("DIVISION BY ZERO");
        System.out.println(e);
        }

        // SECOND LESSON

        // String [] StudentList = { "Alex", "John", "Kely" };

        // try{
        // for(int i=0; i<=3; i++)
        // {
        // System.out.println(StudentList[i]);
        // }

        // }catch( ArrayIndexOutOfBoundsException e ){
        // System.out.println(e);
        // }


        // THIRD LESSON
        // try {
        //     int a = 0;
        //     System.out.println("a = " + a);
        //     int b = 42 / a;
        //     int c[] = { 1 };
        //     c[1] = 99;

        // } catch (ArithmeticException e) {
        //     System.out.println("Divide by 0: " + e);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index out of bound exception: " + e);
        // }

        // System.out.println("After try/catch blocks.");

    }
}
