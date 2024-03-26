public class Lesson07_ForLoopsFactorial {

    public static void main(String[] args) {

        int sum = 1;
        int n = 5;

        for (int samble = n; samble >= 1; samble--){


            sum = sum * samble;
        }

        System.out.println("The sum is " + sum);
    }
    

}
