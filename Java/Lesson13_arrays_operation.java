import java.util.Scanner;

public class Lesson13_arrays_operation {


    public String itemName[] ;
    public int itemPrice[] ;


        public static void main(String[] args) {

            Scanner pembaca = new Scanner(System.in);

            int numberOfItem = 3;
            
            String itemName[] = new String [numberOfItem];
            int itemPrice[] = new int [numberOfItem];
            int quantity[] = new int [numberOfItem];



            // itemName[0] = "Pen";
            // itemName[1] = "Book";
            // itemName[2] = "Table";
            // itemName[3] = "Pencil";
            // itemName[4] = "AS";


            // itemPrice[0] = 12000;
            // itemPrice[1] = 15555;
            // itemPrice[2] = 83493;
            // itemPrice[3] = 2000;
            // itemPrice[4] = 100000;

            // quantity[0] = 12;
            // quantity[1] = 22;
            // quantity[2] = 4;
            // quantity[3] = 66;
            // quantity[4] = 1;


            for (int i = 0; i < numberOfItem; i++) {

                System.out.println("ITEM NAME : ");
                itemName[i] = pembaca.next();

                System.out.println("ITEM PRICE : ");
                itemPrice[i] = pembaca.nextInt();

                System.out.println("aasITEM QUANTITY : ");
                quantity[i] = pembaca.nextInt();



                System.out.println("---------------------");
                System.out.println();


            }


            for (int i = 0; i < numberOfItem; i++) {
                System.out.println(itemName[i]);
            }

            for (int i = 0; i < numberOfItem; i++) {
                System.out.println(itemPrice[i]);
            }

            for (int i = 0; i < numberOfItem; i++) {
                System.out.println(quantity[i]);
            }


            pembaca.close();
        }


    
}
