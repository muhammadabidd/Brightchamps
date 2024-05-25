public class Person {
    
    String name;
    int age;
    char gender;

    Person (String nama, int umur, char kelamin){
        name = nama;
        age = umur;
        gender = kelamin;
    }

    public void sayhi(String kepadasiapa){
        System.out.println("Say hi dari saya yang ganteng ini : " + name + "Kepada kamu yang manis : " + kepadasiapa);
    }




    public static void main(String[] args) {
        

        Person orangpertama = new Person("Abid", 12,'L');

        System.out.println(orangpertama.age);
        System.out.println(orangpertama.name);
        System.out.println(orangpertama.gender);




        orangpertama.sayhi("Putri");


    }


}
