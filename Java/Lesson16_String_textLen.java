import java.util.*;

public class Lesson16_String_textLen {
    public static void main(String[] args) {

       String word ="";
       String longestword = "";

       int len = 0;
       int max_len = 0;

       String mytext = "aksdjalsdkjalsdkjalsdkjalsdkj abid suka makan makanan ";

       String kata_kata = mytext.trim();

       System.out.println("mytext original terdiri dari :" + mytext.length());
       System.out.println("mytext setelah di trim terdiri dari :" + kata_kata.length());

       for (int i = 0; i < kata_kata.length(); i++) {
              char karakter = kata_kata.charAt(i);
              System.out.println(karakter);


              if (karakter != ' '){
              
                     word = word + karakter; 
              }
              else{
                     len = word.length();

                     if (len > max_len){
                            longestword = word;
                            max_len = len;
                     }
                     
                     
                     word = "";
              }
       }

       System.out.println(longestword);

    }
}
