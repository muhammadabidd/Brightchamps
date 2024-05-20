    /*
    Write the PROGRAM to process the application to list the eligible candidates.

    Admission to a professional course is subject to following conditions:
    Marks in mathematics>=60
    Marks in physics>=50
    Marks in chemistry>=40
    Total in all 3 subjects>=200
    */

/**
 * InnerLesson19_interfaces
 */
 interface course {

    void getName(String name);
    void getMarks(int Mathematics, int Coding, int Language);
    int getTotal(int Mathematics, int Coding, int Language);
    void elligible(int Mathematics, int Coding, int Language, int Total);


}




class ElligibilityCheck implements course {

    public void getName(String name) {
        System.out.println("\n Name of candidate : " + name + "\n");
    };

    public void getMarks(int Mathematics, int Coding, int Language) {
        System.out.println("\n Marks of Mathematics : " + Mathematics + "\n");
        System.out.println("\n Marks of Coding : " + Coding + "\n");
        System.out.println("\n Marks of Language : " + Language + "\n");
    };

    public int getTotal(int Mathematics, int Coding, int Language) {
        System.out.println("\n Total Marks : " + (Mathematics + Coding + Language)  + "\n");

        return (Mathematics +  Coding + Language);

    }

    public void elligible(int Mathematics, int Coding, int Language, int Total) {

        if (Mathematics >= 60) {

            if (Coding >= 50) {
                if (Language >= 40) {
                    if (Total >= 200) {
                        System.out.println("CONGRATULATION< YOU ARE ELLIGIBLE TO JOIN THE CREW");
                    }  
                    else{
                        System.out.println("Sorry, your total score is not enaugh");
                    }
                }
                else{
                    System.out.println("Maaf anda tidak elligible, kareana anda tidak bisa ngomong");
                }
            }else{
                System.out.println("Maaf anda tidak elligible, karena anda tidak bisa ngoding");
            }
        }
        else{
            System.out.println("Sorry You are not elligible, your math score is not enaught");
        }



    };    
}





public class Lesson19_interfaces {

    public static void main(String[] args) {

        String name;
        int math, coding, language;
        int total;

        name = "Ujang";
        math = 90;
        coding = 80;
        language = 70;
        
        ElligibilityCheck pengecek1 = new ElligibilityCheck();


        
        pengecek1.getName(name);
        pengecek1.getMarks(math, coding, language);
        total = pengecek1.getTotal(math, coding, language);

        pengecek1.elligible(math, coding, language, total);



    }
    
}
