public class Lesson13_searchBinary {
    


    public static void main(String[] args) {
        

        System.out.println(binarysearch());

        

    }







    public static int binarysearch(){

        int[] numbers = {20, 25, 30, 35, 40};

        int find = 100;
        int left = 0;
        int right = numbers.length;


        while (left <= right){
            
            int mid = (left + right) / 2;
            System.out.println(mid);

            if (numbers[mid]==find){
                System.out.println("GOTCHAA");
                System.out.println("You are in  : " + mid + " position");
                return mid;

            }


            if (numbers[mid] < find){
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }




}
