import java.util.Scanner;

public class Lesson18_Railway_ticket {

    String name, coach;
    int amount;
    long MobileNumber;

    int totalamt = 0;


    void Accept(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name :");
        name = sc.nextLine();


        System.out.println("Please Enter coach");
        System.out.println(" First_AC, Second_AC, Third_AC or sleeper");
        coach = sc.nextLine();


        System.out.print("Please Enter MobileNumber: ");
        MobileNumber = sc.nextLong();


        System.out.print("Please Enter basic ticket amt: ");
        amount = sc.nextInt();


        sc.close();
    }

    void update(){
        if (coach.equalsIgnoreCase("First_AC")) 
           totalamt = amount + 700;    
        else if (coach. equalsIgnoreCase ("Second_AC"))
             totalamt = amount + 500;  
          else if (coach. equalsIgnoreCase ("Third_AC")) 
            totalamt = amount + 250;
         else if (coach. equalsIgnoreCase ("sleeper")) 
            totalamt = amount;

    }

    void display() {
            System.out.println("Details of customer");
            System.out.println("Name: " + name);
            System.out.println("Coach: " + coach);
            System.out.println("Mobile Number: " + MobileNumber);
            System.out.println("Amount: " + amount);
            System.out.println("Total Amount: " + totalamt);
        }


    public static void main(String[] args) {
        
        Lesson18_Railway_ticket tiket1 = new Lesson18_Railway_ticket();
        tiket1.Accept();

        tiket1.update();

        tiket1.display();



    }
    
}
