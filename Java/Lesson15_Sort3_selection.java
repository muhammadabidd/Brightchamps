public class Lesson15_Sort3_selection {
    


    public static void main(String[] args) {
        
        int[] number = {5, 6, 3, 4, 7, 9, 2, 9, 10};


        sorting(number);


        System.out.println("Sorted Array : ");
        for (int i : number) {
            System.out.print(i + " ");
        }

    }






    static void sorting( int myArray[] ){

        for (int i = 0; i < myArray.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < myArray.length; j++) {
            
                System.out.println( myArray[smallest] + " and " +   myArray[j] + " ");

                if (myArray[smallest] > myArray[j]) {
                    smallest = j;
                }

            }


            int temp = myArray[i];
            myArray[i] = myArray[smallest];
            myArray[smallest] = temp;



            System.out.println();

        }


    }
}

