import java.util.Arrays;

public class Arsya_BubbleSearch{



    public static void main(String[] args) {
        
        int[] myarray = {9, 1, 8, 7, 6, 3, 4, 5};
        int len = myarray.length;


        for (int j = 0 ; j < len ; j ++){

            for(int i = 0 ; i < len - 1 - j; i++){
                System.out.println(i + " dibandingkan dengan " + (i+1) );
                System.out.println(myarray[i] + " dibandingkan dengan  " + myarray[i+1]);
                
                if (myarray[i] > myarray[i + 1]) {
                    System.out.println("kedua nilai harusnya di tukar");
    
                    int sementara = myarray[i];
                    myarray[i] = myarray[i+1];
                    myarray[i+1] = sementara;
                }
                
                System.out.println("--------------------");
            }
            
    
            System.out.println(Arrays.toString(myarray));
            System.out.println("#####################################################");
        }

        




    }
}