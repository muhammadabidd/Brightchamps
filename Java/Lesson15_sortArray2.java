public class Lesson15_sortArray2 {
    

    public static void main(String[] args) {
        int[] numbers = {22, 66, 33, 44, 22, 77, 88};



        bublesort(numbers);

        System.out.println();

        System.out.println("Hasil Akhir : ");
        for (int i : numbers) {
                System.out.print(i + " ");
        }


        // pengurutan(numbers, numbers.length);

        
    }

    public static void bublesort(int array[]){

        for (int i=0; i < array.length - 1; i ++){
            System.out.print("INI YANG I-nya ");
            System.out.print(array[i]);
            System.out.println("------------------");

            

            for (int j = 0; j < array.length - 1; j++) {

                System.out.print(array[j] + " and " + array[j+1]+ " ");
                System.out.println("");


                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
    
                }
            }

            System.out.println();

        }
    }




    // public static void pengurutan(int arr[], int n){




    //     for (int i = 0; i < arr.length-1; i++) {
            
    //         System.out.println(i);

    //     }
    // }


}

