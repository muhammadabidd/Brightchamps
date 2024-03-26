import java.io.*;
import java.util.Scanner;

public class Lesson04_01{
    public static void main (String args[])
    {
        // 1. program to find out the odd or even number 
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter number to find out odd or even ");
        int num= s.nextInt();
        
        
        if(num%2 == 0)
        {
            System.out.println("The Number You Have Entered is EVEN!");
        }
        
        else
        {
             System.out.println("The Number You Have Entered is ODD!");
        }
        
        
    }
}