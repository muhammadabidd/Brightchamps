public class Lesson06_Ternary{
    public static void main(String[] args) {
        
        System.out.println("This is Just Testing");

        int age = 17;

        String kelas = (age > 17)? "Allowed to Drive" : "Not Allowed to Drive";

        int num = 20;

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(kelas);
        System.out.println(result);


    }
}