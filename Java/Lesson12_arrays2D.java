public class Lesson12_arrays2D {
    public static void main(String[] args) {
        System.out.println("First Array");
        
        int arraypertama [][] = {{1, 2, 3} , {4, 5, 6}, {7, 8, 9}};

        System.out.println("Getting the memory location of nested array");
        for (int i = 0; i < arraypertama.length; i++) {
            System.out.println(arraypertama[i]);
        };


        System.out.println("Getting the element");
        for (int i = 0; i < arraypertama.length; i++) {
            System.out.println(arraypertama[i][0]);
        }


        System.out.println("Second Array");
        
        int arraykedua [][] = new int[2][2];

        arraykedua[0][0] = 1;
        arraykedua[0][1] = 2;
        arraykedua[1][0] = 3;
        arraykedua[1][1] = 4;

        System.out.println("Getting the memory location of nested array");
        for (int i = 0; i < arraykedua.length; i++) {
            System.out.println(arraykedua[i]);
        };


        System.out.println("Getting the element");
        for (int i = 0; i < arraykedua.length; i++) {
            System.out.println(arraykedua[i][0]);
        }









    }
    
}
