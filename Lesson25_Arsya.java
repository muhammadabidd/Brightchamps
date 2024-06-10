import java.util.Arrays;
import java.util.Scanner;

public class Lesson25_Arsya {
    
    public static void main(String[] args) {
        


        int myarr1[] = buat_array();
        System.out.println(Arrays.toString(myarr1));


        // int myarr2[] = buat_array();
        // System.out.println(Arrays.toString(myarr2));


        element_terbesar(myarr1);


    }

    public static void element_terbesar( int arr[] ){
        int biggest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }


        System.out.println("The biggest element is : " + biggest);
    }



    public static int[] buat_array(){

        Scanner sc = new Scanner(System.in);


        System.out.println("how long is the array will be? ");
        int len = sc.nextInt();
        int myarray[] = new int[len];
        // System.out.println(Arrays.toString(myarray));


        System.out.println("Masukkan nilai dari array yang kosong");

        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = sc.nextInt();
            
        }
        return myarray;
    }




}
