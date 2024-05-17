import java.util.Scanner;

public class Lesson18_Student_score {

    String name;
    int age;
    int m1;
    int m2;
    int m3;
    int maximum;
    double average;

    public Lesson18_Student_score(String n, int a, int x, int y, int z){
        name = n;
        age = a;
        m1 = x;
        m2 = y;
        m3 = z;
        maximum = m1;
        average = 0.0;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Name: ");
        name = sc.nextLine();
        System.out.println("Please enter Age: ");
        age = sc.nextInt();
        System.out.println("Please enter Marks 1: ");
        m1 = sc.nextInt();
        System.out.println("Please enter Marks 2: ");
        m2 = sc.nextInt();
        System.out.println("Please enter Marks 3: ");
        m3 = sc.nextInt();

        sc.close();
    }

    public void compute(){
        average = (m1 + m2 + m3) / 3.0;
        if(m1>m2 && m1>m3)
            maximum = m1;
        else if(m2>m1 && m2>m3)
            maximum=m2;
        else 
            maximum=m3;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
    }

    
    public static void main(String[] args) {

        Lesson18_Student_score student1 = new Lesson18_Student_score("", 0, 0, 0, 0);

        student1.input();

        student1.compute();
        student1.display();
    }

}
