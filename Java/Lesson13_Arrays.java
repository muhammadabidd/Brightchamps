public class Lesson13_Arrays {

    public static void main(String[] args) {
        
        // creating an array



        System.out.println("FIRST ARRAY");
        String[] firstArray = {"Abid", "Budi", "Jhony"};
        
        System.out.println(firstArray);
        System.out.println(firstArray[2]);
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(i);
        }
        System.out.println("---------------------");



        int[] secondArray = {5, 6, 7, 8, 9};
        System.out.println("Second Array");
        System.out.println(secondArray);
        System.out.println(secondArray[2]);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(i);
        }



        // make an array by inilization
        System.out.println("Third Array");
        int thirdArray[] = new int[3];
        thirdArray[0] = 10;
        thirdArray[1] = 11;
        thirdArray[2] = 12;

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);
        }







    }
    
}
