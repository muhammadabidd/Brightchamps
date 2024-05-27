import java.util.Arrays;
public class Lesson23_SelectionSort {







    public static void main(String[] args) {
        
        int[] myarray = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int len = myarray.length ;



        for (int j = 0; j < myarray.length; j++) {
            

            // fix this to j
            int min = j;
            System.out.print("Current minimum index: ");
            System.out.println(min);
    
            for (int i = j; i < len ; i++) {
                System.out.println(" i = " + i + ", The Array value : " + myarray[i]);
        
    
                if (myarray[i] <myarray[min]){
                    min = i;
                    System.out.println("Current Minimum index: " + min);
            
                }
            }


            int temp = myarray[j];
            myarray[j] = myarray[min];
            myarray[min] = temp;





            System.out.println("#######################");
        }





        System.out.println(Arrays.toString(myarray));



    }
}


    
