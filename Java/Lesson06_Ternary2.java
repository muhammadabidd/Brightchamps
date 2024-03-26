public class Lesson06_Ternary2{
    public static void main(String[] args) {

        //  A program to check discount eligibility (member and  age >= 18)
        
        int age = 20;
        boolean member = false ;

        String result = (age >= 18) ? ((member)? "You Are Qualified for the discount" : "You need to be a member to eligible for the discount")  : "You Need at least to be 18 to eligible for the discount" ;

        System.out.println(result);

    }
}