import java.util.Arrays;

public class Lesson22_BubbleSearch {




    public static void main(String[] args) {
        
        int[] myarray = {7, 4, 1, 2, 3};
        int len = myarray.length ;


        for (int j = 0; j < myarray.length - 1; j++) {
            
            for (int i = 0; i < len-1 - j; i++) {
    
                System.out.println(myarray[i]);
                System.out.println("AND");
                System.out.println(myarray[i+1]);
    
                System.out.println("-----------");
    
    
                if (myarray[i] > myarray[i + 1]) {
                    int temp = myarray[i];
                    myarray[i] = myarray[i + 1];
                    myarray[i + 1] = temp;
                }
    
                
            }

            System.out.println("##############################################");
        }



        System.out.println(Arrays.toString(myarray));



    }


}