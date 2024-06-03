import java.util.Arrays;

/**
 * Selection_Sort_arsya
 */
public class Selection_Sort_arsya {

    public static void main(String[] args) {


        int[] MyArray = {9, 1, 8, 7, 5, 4, 6, 3, 2};


        System.out.println(Arrays.toString(MyArray));


        for(int j = 0; j < MyArray.length; j++ ){

            int min_index = j;
            for(int i = j ; i < MyArray.length ; i++){
                System.out.println(MyArray[i]);
    
                if (MyArray[i] < MyArray[min_index]){
                    min_index = i;
    
                    System.out.println("Index yang paling kecil : " + min_index);
                }
    
    
            }
    
    
            int sementara = MyArray[j];
            MyArray[j] = MyArray[min_index];
            MyArray[min_index] = sementara;
        }

        

        System.out.println(Arrays.toString(MyArray));

    }
}