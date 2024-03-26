public class Lesson07_ForLoops {

    public static void main(String[] args) {

        int sum = 0;
        for (int samble =1; samble <= 10; samble = samble + 2){
            System.out.println(samble * 10);

            sum = sum + samble * 10;
        }

        System.out.println("The sum is " + sum);
    }
    

}
