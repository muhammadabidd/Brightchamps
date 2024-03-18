import java.util.Scanner;

public class Lesson05_Switch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float angkakiri, angkakanan, result;
        int operasi;

        System.out.println("Chose your operations : ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Quit");
        operasi = reader.nextInt();




        System.out.println("Enter The First Number:");
        angkakiri = reader.nextFloat();


        System.out.println("Enter the Second Number:");
        angkakanan = reader.nextFloat();

        result = 0;
        switch (operasi) {
            case 1:
                result = angkakiri + angkakanan;
                break;

            case 2:
                result = angkakiri - angkakanan;
                break;

            case 3:
                result = angkakiri * angkakanan;
                break;
            
            case 4:
                result = angkakiri - angkakanan;
                break;


            case 5:
                System.exit(0);
        
            default:
                System.out.println("INVALIDDD");
        }
        

        System.out.println(result);

        reader.close();
    }
}
