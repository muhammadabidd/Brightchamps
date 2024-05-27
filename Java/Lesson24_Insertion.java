import java.util.Arrays;
public class Lesson24_Insertion {

    public static void main(String[] args) {
        
        int[] myarray = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int len = myarray.length ;

        System.out.println(Arrays.toString(myarray));
        for (int i = 0; i < len - 1; i++) {
            int temp = i + 1;
            int index_kiri = temp - 1;

            while(index_kiri >= 0 && myarray[index_kiri] > temp ){
                myarray[index_kiri + 1] = myarray[index_kiri];
                index_kiri = index_kiri - 1;
                System.out.println(Arrays.toString(myarray) + " index kiri : " + index_kiri);
            }


            myarray[index_kiri + 1] = temp;
            System.out.println("####################################################" + Arrays.toString(myarray));
        }

     










        System.out.println(Arrays.toString(myarray));



    }
}


    

