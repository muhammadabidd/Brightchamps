import java.util.Scanner;






public class Arsya03 {
    public static void main(String[] args) {
        Scanner pembacainput = new Scanner(System.in);

        System.out.println("Masukkan Nama anda di bawah ini:");
        String nama = pembacainput.next();



        System.out.println("Nama Saya adalah " + nama);






        System.out.println("----------------");
        Student student1 =  new Student();

        student1.umur = pembacainput.nextInt();

        student1.name = "Ujang";
        System.out.println(student1.name);

        pembacainput.close();
    }
    

}

class Student{
    String name, hobby;
    int umur;
}
