// package Lesson29_Readfile;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class readfile {


    public static void main(String[] args) {
        System.out.println("A");

        File myfile = new File("firstfile.txt");

        Scanner filescanner = new Scanner("firstfile.txt");
        // FileReader myreader = new FileReader("firstfile.txt");

        // System.out.println("Working Directory = " + System.getProperty("user.dir"));
        // if (myfile.exists()){
        //     System.out.println("its there");
        //     System.out.println(myfile.getPath());
        //     System.out.println(myfile.canRead());
        //     System.out.println(myfile.canWrite());
        //     System.out.println(myfile.canExecute());
        // }else{
        //     System.out.println("essdsdsdsd");
        // }

        System.out.println(filescanner.nextLine());


    }
    
}
