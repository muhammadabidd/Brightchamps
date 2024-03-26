import java.util.Scanner;

class Student{
    String name;
    String grade;
    String favSubject;
    int id;
}

class Marksheet{
    int math;
    int physics;
    int coding;
}



public class Lesson03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Student Student1 = new Student();


        System.out.println("Insert The Student1 ID : ");
        Student1.id = reader.nextInt();

        System.out.println("Insert The Student1 Name : ");
        Student1.name = reader.next();

        System.out.println("Insert the Grade : ");
        Student1.grade = reader.next();

        System.out.println("Insert Your Favorite Subject");
        Student1.favSubject = reader.next();



        System.out.println("Student with ID : " +  Student1.id +"This Student name is : "+ Student1.name);


        Marksheet Daftar1 = new Marksheet();
        
        System.out.println("Insert the score of math : ");
        Daftar1.math = reader.nextInt();

        System.out.println("Insert the score of Coding : ");
        Daftar1.coding = reader.nextInt();

        double total = Daftar1.coding + Daftar1.math;
        System.out.println("The total Score is : " + total);


        reader.close();
    }



}


