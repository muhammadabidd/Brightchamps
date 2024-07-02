import java.util.Arrays;
import java.util.Scanner;

public class Lesson35_luckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");   
        int n=sc.nextInt();  //reading an integer from the user that represents the number of elements  
        int arr[]=new int[n];   //creates an array of n  

        int elements = n;


        for(int i=0;i<n;i++)   
        {   
            arr[i]=i+1;   
        } //end of for loop  
        System.out.println(Arrays.toString(arr));


        int del=1;   
        System.out.println("\nLucky Number Operation:\n");   
        while(del<n)   
        {   
            for(int i=del; i<n; i+=del)   
            {   
                for(int j=i; j<n-1; j++)   
                {   
                    arr[j]=arr[j+1];   
                } //end of for loop  
                n--;   
            } //end of for loop  
            del++;   
            for(int i=0; i<n; i++)   
            {   
                System.out.print(arr[i]+" ");   
            } //end of for loop  
            System.out.println();   
        } //end of while loop    


        System.out.print("\nHence, the Lucky Numbers Less than "+elements+" are: ");   

        for(int i=0; i<n; i++)   
        {   
            System.out.print(arr[i]+" ");   
        } //end of for loop  




    }
    
}
