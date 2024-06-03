import java.util.Arrays;
import java.util.Scanner;

public class Lesson25_Largest_Element {
    int arr[];

    public void input(int size) {
        arr = new int[size]; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please fill the array :");
        for (int i = 0; i < size; i++) 
        {
            System.out.println("Enter the array element:");
            arr[i] = sc.nextInt(); 
        }
    }


    public void find_largest(){

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                    largest = arr[i];
            }            
        }

        System.out.println("The Biggest element is : " + largest);

    }

    public void display_array(){
        System.out.println("The Array : ");

        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");   
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lesson25_Largest_Element obj = new Lesson25_Largest_Element();

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt(); 


        obj.input(size);
        obj.display_array();
        obj.find_largest();
        

        sc.close();

    }
}