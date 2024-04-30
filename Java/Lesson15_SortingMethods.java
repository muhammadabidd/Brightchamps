import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson15_SortingMethods {
    


    public static void main(String[] args) {
        
        int[] numbers = {22, 55, 11, 44, 33, 20};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
