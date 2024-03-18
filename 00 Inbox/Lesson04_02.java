import java.io.*;
import java.util.Scanner;

public class Lesson04_02{
    public static void main (String args[])
    {
        // 1. program to find out the largest number to implement if-else 
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter first number ");
        int a= s.nextInt();
        
        System.out.println("Enter Second number ");
        int b= s.nextInt();
        
        System.out.println("Enter Third number ");
        int c= s.nextInt();
        
        
    if ( (a > b ) && (a > c ))
    {
        System.out.println ("The greatest Number is "+a);
    }
    
    else if ( (b> a) && ( b>c ))
    {
        System.out.println ("The greatest Number is "+b);
    }
    
    else
    {
        System.out.println ("The greatest Number is "+c); 
    }
        
    }
}
