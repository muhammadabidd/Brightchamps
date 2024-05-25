// import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unused")
public class Lesson14 {

    public static void main(String[] args) {

        int [] nilaitidakteratur = {7, 5, 4, 3, 6, 3, 1};


        System.out.println("Sebelum DIurutkan : ");
        for( int nilai : nilaitidakteratur ){
            System.out.print(nilai + " ");
        }



        // Arrays.sort(nilaitidakteratur);


        mengurutkan(nilaitidakteratur);

        System.out.println();
        System.out.println("Sesudah diurutkan :");
        for (int nilai : nilaitidakteratur){
            System.out.print(nilai + " ");
        }

       


    }


    public static void mengurutkan(int arraysaya[] ){

        for (int i = 0; i < arraysaya.length - 1; i++) {

            for (int j = 0; j < arraysaya.length - 1; j++) {
                
                if (arraysaya[j] > arraysaya[j+1]){
                    int temp = arraysaya[j];
                    arraysaya[j] = arraysaya[j+1];
                    arraysaya[j+1] = temp;

                }


            }

            
        }

    }


    



}